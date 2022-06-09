package Orange_HRM_Login;

public class Constructor_learn{
	int employeeid;
	String employeename;
	double salary;
	
	//default constructor
	Constructor_learn() {
	System.out.println("iam default constructor");
	}
	//parameterized constructor
	Constructor_learn(int employeeid) {
		System.out.println("iam default constructor");
		this.employeeid=employeeid;
		}
		
	Constructor_learn(String employeename,double salary) {
		System.out.println("iam default constructor");
		this.employeename=employeename;
		this.salary=salary;
		}
	Constructor_learn(String employeename,float salary) {
		System.out.println("iam default constructor");
		this.employeename=employeename;
		this.salary=salary;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructor_learn e1=new Constructor_learn();
		Constructor_learn e2=new Constructor_learn(1);
		System.out.println("e2.employeeid");
		Constructor_learn e3=new Constructor_learn("venky",60000.00);
		System.out.println("e23.employeename+e3 salary");
		
		
	}

}


