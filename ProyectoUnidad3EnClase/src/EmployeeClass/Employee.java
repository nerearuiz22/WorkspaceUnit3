package EmployeeClass;

public class Employee {

	//ATRIBUTOS
	private int Id;
	private String FirstName;
	private String LastName;
	private int Salary;
	
	//CONSTRUCTOR
	public Employee(int id, String firstName, String lastName, int salary) {
		super();
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		Salary = salary;
	}
	
	//GETTERS Y SETTERS
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	
	//GETTERS DE FUNCIONALIDAD
	
	public String getName() {
		return this.FirstName + " " + this.LastName;
	}
	
	public int getAnnualSalary ()  {
		return this.Salary*12;
	}
	
	//MÉTODOS DE FUNCIONALIDAD
	public int raiseSalary (int percent) {
		double percentage = (double) percent/100;
    	double SalaryDec = this.Salary;
    	SalaryDec+=SalaryDec+SalaryDec*percentage;
    	setSalary ((int) Math.round(SalaryDec));
    	
    	
    	return this.Salary;
    }
	
	
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Salary=" + Salary
				+ "]";
}

	}
