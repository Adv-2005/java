

	class FullTimeEmp extends EMPLOYEE {
	    private double bonus;
	    private double deductions;

	    public FullTimeEmp(String name, int empId, double salary, double bonus, double deductions) {
	        super(name, empId, salary);
	        this.bonus = bonus;
	        this.deductions = deductions;
	    }

	    public double calculateSalary() {
	        return salary + bonus - deductions;
	    }

	   
	    public void displayEmployeeDetails() {
	        super.displayEmployeeDetails();
	        System.out.println("Bonus: " + bonus);
	        System.out.println("Deductions: " + deductions);
	        System.out.println("Net Salary: " + calculateSalary());
	    }
	}

