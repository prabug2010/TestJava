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
			String s = "{\"name\":\"yyy\",\"age\":33,\"place\":\"bengaluru\"}";
			mapper.readValue(s, Employee.class);
			System.out.println(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}