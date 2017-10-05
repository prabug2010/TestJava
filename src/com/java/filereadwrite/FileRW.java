package com.java.filereadwrite;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileRW {

	public static void main(String[] args) throws IOException {

		try
		{
			byte[] source = Files.readAllBytes(Paths.get("D:/NewFile2.txt"));
			Files.write(Paths.get("D:/NewFile20.txt"), source);
			byte[] target = Files.readAllBytes(Paths.get("D:/NewFile20.txt"));
			String cont = new String(target);
			String[] s = cont.split(" ");
			System.out.println("no of strings in file : "+s.length);
			char[] ch = cont.toCharArray();
			System.out.println("no of chars in string are : "+ch.length);
			if(new String(source).equals(new String(target)))
			{
				System.out.println("file read and written successfully");
			}
					
		}finally
		{
			System.out.println("file operation is done");
		}
	}

}
