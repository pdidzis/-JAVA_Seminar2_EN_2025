package model;

public class Grade {
	//1.variables
	private long gId;
	private int grValue;
	private Student student;
	private Course course;
		
	private static long counter = 30000;
	
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
		gId = counter++;
	}
	
	public void setGrValue(int inputGrValue) {
		if(inputGrValue >= 1 && inputGrValue <= 10) {
			grValue = inputGrValue;
		}
		else
		{
			grValue = 0;
		}
	}
	
	public void setStudent(Student inputStudent) {
		if(inputStudent != null) {
			student = inputStudent;
		}
		else
		{
			student = new Student();
		}
	}
	
	public void setCourse(Course inputCourse) {
		if(inputCourse != null) {
			course = inputCourse;
		}
		else
		{
			course = new Course();
		}
	}
	
	//4. default cons.
	public Grade() {
		setGId();
		setGrValue(0);
		setStudent(new Student());
		setCourse(new Course());
	}

	//5. arg. cons.
	public Grade(int inputGrValue, Student inputStudent, Course inputCourse)
	{
		setGId();
		setGrValue(inputGrValue);
		setStudent(inputStudent);
		setCourse(inputCourse);
	}
	
	//6. toString
	public String toString() {
		return gId + ": " + grValue + "-> " 
	+ student.getName().charAt(0) + ". " + student.getSurname()
	+ " (" + course.getTitle() + ")";
	}
	

}