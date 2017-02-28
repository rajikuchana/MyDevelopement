package com.java.tutorial;

import java.io.File;
import java.io.IOException;


public class DeleteFiles {

	public static void main(String[] args) throws IOException  {
		
		File file = new File("E:\\java\\Files\\Createfile.xlsx");
		
		if(file.exists()){
			System.out.println("File is Exists in Specified path");
			file.delete();
			System.out.println("Deleting exists file in specified path-"+file.getName());
			
		}else{
			System.out.println("File is not exists in Specified path");
			file.createNewFile();
			System.out.println("New file is created with -"+file.getName());
			
		}
		
		

	}

}
