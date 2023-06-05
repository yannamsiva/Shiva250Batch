
public class Employee {
	
	//non-static varibles/instance methods
	
	int eno=100;
	String ename="rani";
	
	double esal=2500.25;
	
	String email="yannamsiva@gmail.com";
	
	long mobileNumber=9985538462L;
	
	
	//non-static Method
	void displayDetails()
	{
		System.out.println("From Non-static Method : ");
		System.out.println(eno+"\t"+ename+"\t"+esal+"\t"+email+"\t"+mobileNumber);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee emp=		new Employee();
	System.out.println(emp.eno+"\t"+emp.ename+"\t"+emp.esal+"\t"+emp.email+"\t"+emp.mobileNumber);	
	emp.displayDetails();
	}

}
