

	class PartTimeEmp extends EMPLOYEE {
	    private int hoursWorked;
	    private static final double hourlyRate = 20.0; // Example hourly rate

	    public PartTimeEmp(String name, int empId, double salary, int hoursWorked) {
	        super(name, empId, salary);
	        this.hoursWorked = hoursWorked;
	    }

	
	    public double calculateSalary() {
	        return hoursWorked * hourlyRate;
	    }


	    public void displayEmployeeDetails() {
	        super.displayEmployeeDetails();
	        System.out.println("Hours Worked: " + hoursWorked);
	        System.out.println("Hourly Rate: " + hourlyRate);
	        System.out.println("Total Salary: " + calculateSalary());
	    }
	}

