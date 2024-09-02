
public class EMPLOYEE {
	
	    private String name;
	    private int empId;
	    protected double salary;

	    public EMPLOYEE(String name, int empId, double salary) {
	        this.name = name;
	        this.empId = empId;
	        this.salary = salary;
	    }

	    public double calculateSalary() {
	        return salary;
	    }

	    public void displayEmployeeDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("Employee ID: " + empId);
	        System.out.println("Salary: " + salary);
	    }
	    
	    public static void main(String[] args) {
	      
	        EMPLOYEE emp = new EMPLOYEE("Alice", 101, 50000);
	        FullTimeEmp fullTimeEmp = new FullTimeEmp("Bob", 102, 60000, 5000, 2000);
	        PartTimeEmp partTimeEmp = new PartTimeEmp("Charlie", 103, 0, 120);

	      
	        emp.displayEmployeeDetails();
	        System.out.println();

	        fullTimeEmp.displayEmployeeDetails();
	        System.out.println();

	        partTimeEmp.displayEmployeeDetails();
	        System.out.println();

	       
	        EMPLOYEE ref;
	        ref = fullTimeEmp;
	        ref.displayEmployeeDetails(); 

	        ref = partTimeEmp;
	        ref.displayEmployeeDetails(); 
	    }
	}

