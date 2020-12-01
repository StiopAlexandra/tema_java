package org.example;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileUtility {

	public static void writeToFile(Employee employee1){
		XmlMapper xmlMapper = new XmlMapper();
		File file = new File("src/main/resources/employee.xml");
		try {
			xmlMapper.writeValue(file, employee1);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Employee readFromFile() {
		XmlMapper xmlMapper = new XmlMapper();
		try {
			String xml = new String(Files.readAllBytes(Paths.get("src/main/resources/employee.xml")));
			return xmlMapper.readValue(xml, Employee.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
