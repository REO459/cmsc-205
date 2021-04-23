package edu.ben.sandbox.objects;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;

public class test {

	public static void main(String[] args) {
		// decimal formatter
		DecimalFormat twoDForm = new DecimalFormat("#.##");
		// 0 will displayed as 0.00
		twoDForm.setMinimumFractionDigits(2);
		File f = new File("lab3thermalplateSAMPLE.input"); 
		Plate[] returnedPlates = test.processTempsFromFile(f, 2);

		// the first plate in the array of plates
		Plate p1 = returnedPlates[0];
		// the second plate

		// print the plate grid
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 12; j++) {
				// formatted output
				// - is for left alignment
				System.out.printf("%-6s ", twoDForm.format(p1.getPlate()[i][j]));
				//System.out.print(twoDForm.format(p1.plateGrid[i][j]) + "\t");
			
			}
			System.out.println();
		}	
	}
	
	
public static Plate[] processTempsFromFile(File f, int numPlates)  {
	
		
		// create collection of plates using numPlates
		Plate[] plates = new Plate[numPlates];
		BufferedReader bf;
		try {

			// read the file
			bf = new BufferedReader(new FileReader(f));
			// string variable to store each line
			String str;
			// variables to store the four temperatures
			double top, right, bottom, left;
			// counts plates
			int plateCounter = 0;
			// to check whether an update is significant
			boolean significantFound = false;
			// while there is more line to read
			// store the line onto str
			while ((str = bf.readLine()) != null) {
				// set significantFound to true
				significantFound = true;
				// split str by comma to obtain a string array
				String[] line = str.trim().split(",");
				// if the line don't contain 4 values
				// skip the line
				if (line.length != 4)
					continue;
				// convert string to double
				top = Double.parseDouble(line[0]);
				right = Double.parseDouble(line[1]);
				bottom = Double.parseDouble(line[2]);
				left = Double.parseDouble(line[3]);
				//System.out.println(top + ", " + right + ", " + bottom + ", " + left);
				// create plate that has 12 by 12 grid
				Plate aPlate = new Plate(new double[12][12]);
				// store the plate to the array
				plates[plateCounter] = aPlate;

				// fill everything with the initial temperature
				for (int i = 0; i < 12; i++) {
					for (int j = 0; j < 12; j++) {
						aPlate.getPlate()[i][j] = 68.0;
					}

				}
				// make the 4 edges 0
				aPlate.getPlate()[0][0] = 0.0;
				aPlate.getPlate()[0][11] = 0.0;
				aPlate.getPlate()[11][0] = 0.0;
				aPlate.getPlate()[11][11] = 0.0;

				// fill the edges of the array
				// fill top(0,1 to 0,10)
				for (int i = 1; i <= 10; i++) {
					aPlate.getPlate()[0][i] = top;

				}
				// fill right edge(1,11 to 10,11)
				for (int i = 1; i <= 10; i++) {
					aPlate.getPlate()[i][11] = right;

				}

				// fill bottom edge(11,1 to 11,10)
				for (int i = 1; i <= 10; i++) {
					aPlate.getPlate()[11][i] = bottom;

				}

				// fill left edge(1,0 to 10,0)
				for (int i = 1; i <= 10; i++) {
					aPlate.getPlate()[i][0] = left;

				}

				// update plate till stable
				// if any grid has significant change
				// the loop will repeat
				int updateCount = 0;
				while (significantFound) {
				
					// make it false first
					// as if all changes are insignificant
					significantFound = false;

					// 1,1 to 10,1
					// 10,1 to 10,10
					// go from row1 to row10
					for (int i = 1; i <= 10; i++) {
						// go from column1 to colum10
						for (int j = 1; j <= 10; j++) {
							double v1 = aPlate.getPlate()[i - 1][j];
							double v2 = aPlate.getPlate()[i][j - 1];
							double v3 = aPlate.getPlate()[i][j];
							double v4 = aPlate.getPlate()[i][j + 1];
							double v5 = aPlate.getPlate()[i + 1][j];

							// previous value
							double prev_value = aPlate.getPlate()[i][j];
							double new_value = (v1 + v2 + v3 + v4 + v5) / 5;
							// check if change is significant
							if (Math.abs(prev_value - new_value) > 0.141) {
								// the loop will continue
								significantFound = true;
							}
							// update plate
							aPlate.getPlate()[i][j] = new_value;

						}
					}
					updateCount++;
				}
				System.out.println("Updated " + updateCount + "times" );
				// move to the next plate
				plateCounter++;

			}

			// close the buffered reader
			bf.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return the plates array
		return plates;
	}

}
