package model;


public class Course {
	//1.variables
	private long cId;
	private String title;
	private int creditPoints;
	private Professor professor;
	
	private static long counter = 20000;

	
	//2.getters
	
	public long getcId() {
		return cId;
	}

	public String getTitle() {
		return title;
	}

	public int getCreditPoints() {
		return creditPoints;
	}

	public Professor getProfessor() {
		return professor;
	}
	
	//3.setters
	
	public void setCId() {
		cId = counter++;
		
	}

	
	//4.default const
	
	//5.argument const
	
	//6.toString
	
	//other functions
	
	
}
