package com.assignments.fileOperations;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileOperations {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String filename="C:\\Workspaces\\Chubb_Workspace\\Assignments\\src\\com\\assignments\\fileOperations\\countIndia.txt";
		int count=0;
		
		try(BufferedReader br=new BufferedReader(new FileReader(filename))){
			String line; // It will iterate through the para
			while((line=br.readLine())!=null) {
				line.toLowerCase();
				String[] words=line.split(" ");
				// trying to split words from lines into string array
				for(String word:words) {
					if(word.equalsIgnoreCase("india")) {
						count++;
					}
				}
				System.out.println(count);
			}
		}
			catch(IOException e) {
				System.out.println("Error reading file");
			}
		

	}

}
