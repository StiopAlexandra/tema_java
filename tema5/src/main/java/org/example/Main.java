package org.example;

public class Main {
	public static void main(String[] args) {
		Employee employee1 = new Employee("John","Doe", 5842);
		FileUtility.writeToFile(employee1);

		Employee employee2 = FileUtility.readFromFile();
		System.out.println(employee2.toString());
	}
}
