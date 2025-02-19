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
	
	public void setTitle(String inputTitle) {
		if(inputTitle != null && inputTitle.matches("[A-Za-z()]{4-40}")) {
			title = inputTitle;
		}
		else 
		{
			title = "No title";
		}
	}
	
	public void setCreditPoints(int inputCreditPoints) {
		if(inputCreditPoints > 0 && inputCreditPoints <= 30) {
			creditPoints = inputCreditPoints;
		}
		else 
		{
			creditPoints = 3;
		}
	}
	
	public void setProfessor(Professor inputProfessor) {
		if(inputProfessor != null) {
			professor = inputProfessor;
		}
		else 
		{
			professor = new Professor(); // it will link default professor from Professor class
		}
	}
	//4.default const
	
	public Course() {
		setCId();
		setTitle("Test Course");
		setCreditPoints(3);
		setProfessor(new Professor());
	}
	
	//5.argument const
	
	public Course(String inputTitle, int inputCreditPoints, Professor inputProfessor)  {
		setCId();
		setTitle(inputTitle);
		setCreditPoints(inputCreditPoints);
		setProfessor(inputProfessor);
	} 
	

	//6.toString

	public String toString()
	{
		return cId + ": " + title + " " + creditPoints + " " + professor;
	}
	
	//other functions
	
	
}
