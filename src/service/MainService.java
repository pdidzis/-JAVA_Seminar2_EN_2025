package service;

import model.Student;

public class MainService {
	public static void main(String[] args) {
		
		Student st1 = new Student();
		System.out.println(st1.toString()); // We can use without toString() cause it will be called by default here
		
		Student st2 = new Student("John", "Green");
		System.out.println(st2);
		
		Student st3 = new Student("2342342", "425245243");
		System.out.println(st3);
	}
	
}
