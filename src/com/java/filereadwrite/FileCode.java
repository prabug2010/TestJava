package com.java.filereadwrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCode {

		public static void main(String[] args) throws IOException {

			try {

				byte[] sourceByte = Files.readAllBytes(Paths.get("D:/NewFile1.txt"));
				Path target = Files.write(Paths.get("D:/NewFile11.txt"), sourceByte);
				String contents = new String(sourceByte);
				System.out.println(contents);
				System.out.println(contents.length());
				String[] s = contents.split(" ");
				System.out.println(s.length);
				byte[] targetByte = Files.readAllBytes(Paths.get("D:/NewFile11.txt"));
				if (new String(targetByte).equals(new String(sourceByte))) {
					System.out.println("File read and written");
				}
			} finally {
				System.out.println("file read successfully");
			}
		}
}
