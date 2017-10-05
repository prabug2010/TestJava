package com.java.filereadwrite;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileBufferRead {

	public static void main(String[] args) throws IOException {

		FileReader fr = null;
		BufferedReader br = null;
		try
		{
			fr = new FileReader("D:/NewFile2.txt");
			br = new BufferedReader(fr);
			String current  = "";
			while((current=br.readLine())!=null)
					{
				System.out.println(current);
					}
		}catch (IOException e)
		{
			e.printStackTrace();
		}
	finally
	{
		if(br != null)
			br.close();
		if(fr!=null)
			fr.close();
	}
	}
}
