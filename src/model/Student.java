package model;

public class Student {
	//1. variables
	private long stID;
	private String name;
	private String surname;
	
	private static long counter = 0;
	
    //2. getters	
	public long getStID() {
		return stID;
	}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	//3. setters
	
	public void setStID() {
		stID = counter;
		counter++;
	}
	
	
	public void setName(String inputName) {
		if(inputName!=null && inputName.matches("[A-Z]{1}[a-z]{3,15}")) {
			name = inputName;
		}
		else
		{
			name = "No name";
		}
	}
	
	public void setSurname(String inputSurname) {
		if(inputSurname !=null && inputSurname.matches("[A-Z]{1}[a-z]{3,30}")) {
			surname = inputSurname;
		}
		else
		{
			surname = "No surname";
		}
	}
		

	//4. default constructor
	public Student() {
		setStID();
		setName("Test");
		setSurname("Test");
	}
	
	
	//5. argument constructor
	public Student(String inputName, String inputSurname) {
		setStID();
		setName(inputName);
		setSurname(inputSurname);
	}
	
	//6. toString function	
	public String toString()
	{
		return stID + ": " + name + " " + surname;
	}
	//7. other functions (if necessary)
}