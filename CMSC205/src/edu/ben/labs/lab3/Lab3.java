package edu.ben.labs.lab3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;


/**
 * This is lab 3
 * 
 * @author omerb
 * @version 1.0
 */
public class Lab3 {
	
	/**
	 * This is my private constructor
	 */
	private Lab3() {
		
	}
	
	/**
	 * 
	 * @param args the main method
	 */
	public static void main(String[] args) {
		// this converts the plates to 2 decimal places
		DecimalFormat twoDForm = new DecimalFormat("#.##");
		twoDForm.setMinimumFractionDigits(2);
	}

	/**
	 * 
	 * @param f if the file is available to be used
	 * @param numPlates shows how many plates are there
	 * @return plates all of the plates that are calculated
	 * @throws FileNotFoundException if there is no file to be found
	 */
	public static Plate[] processTempsFromFile(File f, int numPlates) throws FileNotFoundException {

		Plate[] plates = new Plate[numPlates];
		BufferedReader bf;
		try {
			bf = new BufferedReader(new FileReader(f));
			// labels of the plate
			String str;
			double top;
			double right;
			double bottom;
			double left;
			int plateCounter = 0;
		
			// check to see if any of the arrays has changed
			boolean significantFound = false;
			while ((str = bf.readLine()) != null) {
				significantFound = true;
				String[] line = str.trim().split(",");
				if (line.length != 4) {
					continue;
				}
				
				// create the inner layer of the arrays with 68
				top = Double.parseDouble(line[0]);
				right = Double.parseDouble(line[1]);
				bottom = Double.parseDouble(line[2]);
				left = Double.parseDouble(line[3]);
				Plate aPlate = new Plate(new double[12][12]);
				plates[plateCounter] = aPlate;
				double[][] plateArea = aPlate.getPlate();
				for (int i = 0; i < 12; i++) {
					for (int j = 0; j < 12; j++) {
						plateArea[i][j] = 68.0;
					}
				}
				
				// create the outer layers of the array
				plateArea[0][0] = 0.0;
				plateArea[0][11] = 0.0;
				plateArea[11][0] = 0.0;
				plateArea[11][11] = 0.0;
				for (int i = 1; i <= 10; i++) {
					plateArea[0][i] = top;
				}
				for (int i = 1; i <= 10; i++) {
					plateArea[i][11] = right;
				}
				for (int i = 1; i <= 10; i++) {
					plateArea[11][i] = bottom;
				}
				for (int i = 1; i <= 10; i++) {
					plateArea[i][0] = left;
				}
				
				// does the equation
				while (significantFound) {
					significantFound = false;
					for (int i = 1; i <= 10; i++) {
						for (int j = 1; j <= 10; j++) {
							double v1 = plateArea[i - 1][j];
							double v2 = plateArea[i][j - 1];
							double v3 = plateArea[i][j];
							double v4 = plateArea[i][j + 1];
							double v5 = plateArea[i + 1][j];
							double oldPlate = plateArea[i][j];
							double newPlate = (v1 + v2 + v3 + v4 + v5) / 5;
							if (Math.abs(oldPlate - newPlate) > 0.141) {
								significantFound = true;
							}
							plateArea[i][j] = newPlate;
						}
					}
				}
				plateCounter++;
			}
			bf.close();
			
		// checks if the file is not found
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// returns the plates
		return plates;
	}

}
