package model;

public class Professor {
	//1.variables
	private long pId;
	private String name;
	private String surname;
	private Degree degree;
	
	private static long counter = 10000;
	//2.getters

	public long getpId() {
		return pId;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public Degree getDegree() {
		return degree;
	}
	
	
	//3.setters
	
	public void setPID() {
		pId = counter;
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
		
	
	public void setDegree(Degree inputDegree) {
		if(inputDegree!=null)
		{
			degree = inputDegree;
		}
		else
		{
			degree = Degree.other;
		}
	}

	//4.default constructor
	
	//5.args constructor
	//6.toString
	//7.other functions
	
}