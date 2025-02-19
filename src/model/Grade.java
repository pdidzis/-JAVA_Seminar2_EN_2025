package model;

public class Grade {
	//1.variables
	private  long gId;
	private int grValue;
	private Student student;
	private Course course;
	
	private static long counter = 20000;
	//2.getters
	
	public long getgId() {
		return gId;
	}
	public int getGrValue() {
		return grValue;
	}
	public Student getStudent() {
		return student;
	}
	public Course getCourse() {
		return course;
	}
	
	//3.setters
	
	public void setGId() {
		gID = counter++;
	}
	
	public void setGrValue(int inputGrValue) {
		if (inputGrValue >= 1 && inputGrValue <= 10) {
			grValue = inputGrValue;
		}
		else 
		{
			grValue = 0;
		}
		
	}
	public void SetStudent(Student inputStudent) {
		if(inputStudent != null) {
			student =inputStudent;
		}
		else 
		{
			student = new Student();
		}
	}
	
	public void setCourse(Course inputCourse) {
		if(inputCourse != null) 
		{
			course = inputCourse;
		}
		else 
		{
			course = new Course();
		}
	}
	

	
	
}
