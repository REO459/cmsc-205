package edu.ben.labs.lab5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * This is my cargo loader
 * 
 * @author omerb
 * @version 1.0
 */
public class CargoLoader {
	
	/**
	 * This is my constructor
	 */
	private CargoLoader() {
		
	}

	/**
	 * load the cargo
	 * 
	 * @param aircraftLog the aircraft log
	 * @param cargoLog    the cargo log
	 */
	public static void loadCargo(File aircraftLog, File cargoLog) {
		System.out.println("********** CARGO MANIFEST **********");
		MyStack airplanes = new MyStack(100);
		Scanner input1;
		// loads the airplane file
		try {
			input1 = new Scanner(aircraftLog);
			input1.nextLine();
			while (input1.hasNextLine()) {
				String fileText = input1.nextLine();
				String[] values = fileText.split(",");
				try {
					Airplane aircraft = new Airplane(nonNumeric(values[0]), nonNumeric(values[1]),
							nonNumeric(values[2]), nonNumeric(values[3]));
					airplanes.push(aircraft);
				} catch (NumberFormatException e) {
			        e.printStackTrace();
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// load the cargo file
		Scanner input2;
		MyStack notLoaded = new MyStack(100);
		try {
			input2 = new Scanner(cargoLog);
			input2.nextLine();
			while (input2.hasNextLine()) {
				String fileText = input2.nextLine();
				String[] values = fileText.split(",");
				try {
					Cargo cargos = new Cargo(nonNumeric(values[0]), nonNumeric(values[1]), nonNumeric(values[2]),
							nonNumeric(values[3]));
					boolean loaded = false;
					for (int i = 0; i < airplanes.getSize(); i++) {
						Airplane a = (Airplane) airplanes.get(i);
						if (a.getRemainingCapacity() > cargos.getCubicFeet()
								&& a.getRemainingWeight() > cargos.getWeight()) {
							a.putCargo(cargos);
							loaded = true;
							break;
						}
					}
					if (!loaded) {
						notLoaded.push(cargos);
					}
				} catch (NumberFormatException e) {
			        e.printStackTrace();
				}
			}
			System.out.println(airplanes + "\n" + "Unable to load the following cargo on any available aircraft:");
			for (int i = 0; i < notLoaded.getSize(); i++) {
				System.out.println("\t" + notLoaded.get(i));
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * this will output the manifest and the data from our files
	 * 
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		loadCargo(new File("aircraftLog.txt"), new File("cargoLog.txt"));
	}

	/**
	 * accounts for any non numeric numbers and drops them, keeps the digits only
	 * 
	 * @param s the string being passed in
	 * @return Integer.parseInt(newText) the integers inside of the string only
	 */
	public static int nonNumeric(String s) {
		String newText = "";
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				newText += s.charAt(i);
			}
		}
		return Integer.parseInt(newText);
	}
}
