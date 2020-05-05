class Employee{
	String name;
	long id;
	int age;
	void getEmployeeDetails(String name, long id, int age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}
	
	void showEmployeeDetails() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(name + "is the employee." + "His id is "+id );
	}
	
	
	
	
	
	
	
}
public class Oops1 {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.getEmployeeDetails("Mahesh", 10997, 31);
		e2.getEmployeeDetails("Sona", 723632, 31);
		
		e1.showEmployeeDetails();
         e2.showEmployeeDetails();
         
         Employee e3 = e1;
         e3.showEmployeeDetails();
	}

}
