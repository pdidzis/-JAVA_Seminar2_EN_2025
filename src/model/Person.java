package model;

public class Person {
	//1. variables
	protected String name;
	protected String surname;
	
	//2.getters
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	//3. setters
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
	//4. no arg.con
	public Person() {
		setName("Test");
		setSurname("Person");
	}
	
	//5. arg. const.
	public Person(String inputName, String inputSurname)
	{
		setName(inputName);
		setSurname(inputSurname);
	}
	//6.toString
	public String toString() {
		return name + " " + surname;
	}
}