package com.json.codes;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Java2Json {

	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		Employee emp = new Employee();
		emp.setAge(29);
		emp.setName("Prabu");
		emp.setPlace("Bengaluru");

		try {
			String s = mapper.writeValueAsString(emp);
			System.out.println(s);
			File jsonInputFile = new File("D:\\sampletwo.txt");
			mapper.writeValue(jsonInputFile, emp);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
