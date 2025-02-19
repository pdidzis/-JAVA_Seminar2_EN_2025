package service;

import model.Degree;
import model.Professor;
import model.Student;


public class MainService {
	public static void main(String[] args) {
		
		//Student
		Student st1 = new Student();
		System.out.println(st1.toString()); // We can use without toString() cause it will be called by default here
		
		Student st2 = new Student("John", "Green");
		System.out.println(st2);
		
		Student st3 = new Student("2342342", "425245243");
		System.out.println(st3);
		
		Student st4 = new Student(null, null);
		System.out.println(st4);
	
		//Professor
		Professor p1 = new Professor();
		System.out.println(p1.toString());
		
		Professor p2 = new Professor("Amy", "Taylor", Degree.dr);
		System.out.println(p2.toString());
		
		Professor p3 = new Professor("13421243", "13451345", Degree.bsc);
		System.out.println(p3.toString());
		
		Professor p4 = new Professor(null, null, null);
		System.out.println(p4.toString());
		
		//Course
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
