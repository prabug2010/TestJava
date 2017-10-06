package com.json.codes;

import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Json2Java {

	public static void main(String args[]) {
		ObjectMapper mapper = new ObjectMapper();
		Employee emp = new Employee();
		try {
			File jsonInputFile = new File("D:\\sampleone.txt");
			emp = mapper.readValue(jsonInputFile, Employee.class);
			System.out.println(emp);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}