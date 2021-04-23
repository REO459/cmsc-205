package edu.ben.homeworks.homework0;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Homework0 {

	public static void main(String[] args) {
		
		 File file = new File("GreenEggsAndHam.txt");

	        try {
	            //
	            // Create a new Scanner object which will read the data 
	            // from the file passed in. To check if there are more 
	            // line to read from it we check by calling the 
	            // scanner.hasNextLine() method. We then read line one 
	            // by one till all line is read.
	            //
	            Scanner scanner = new Scanner(file);
	            while (scanner.hasNextLine()) {
	                String line = scanner.nextLine();
	                //store this line to string [] here
	                System.out.println(line);
	            }
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        }

	}
}
