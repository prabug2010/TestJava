package com.javapractice2019;

import java.io.File;
import java.io.IOException;

public class FileExercise {

	public static void main(String[] args) {
		try {
			
			String filename = "newfile1.txt";
			String absolutePath = "";
			String workingDir = System.getProperty("user.dir");
			
			absolutePath = workingDir+File.separator+filename;
			
			File fil = new File(absolutePath);
			
			if(fil.createNewFile())
				System.out.println("new file created");
			else
				System.out.println("File already exists");
			
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
