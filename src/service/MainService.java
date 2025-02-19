package service;

import model.Degree;
import model.Professor;
import model.Student;


public class MainService {
	public static void main(String[] args) {
		
		Student st1 = new Student();
		System.out.println(st1.toString()); // We can use without toString() cause it will be called by default here
		
		Student st2 = new Student("John", "Green");
		System.out.println(st2);
		
		Student st3 = new Student("2342342", "425245243");
		System.out.println(st3);
		
		Student st4 = new Student(null, null);
		System.out.println(st4);
	
		Professor pf1 = new Professor();
		System.out.println(pf1.toString());
		
		Professor pf2 = new Professor("Amy", "Taylor", Degree.dr);
		System.out.println(pf2.toString());
		
		Professor pf3 = new Professor("13421243", "13451345", Degree.bsc);
		System.out.println(pf3.toString());
		
		Professor pf4 = new Professor(null, null, null);
		System.out.println(pf4.toString());
		
		
		
	}
	
	
	
	
	
}
