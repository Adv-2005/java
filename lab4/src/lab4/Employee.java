package lab4;

import java.util.Scanner;

class Employee {
    private String Ename;
    private int Eid;
    private double Basic;
    private double DA;
    private double Gross_Sal;
    private double Net_Sal;

   
    public void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        Ename = scanner.nextLine();
        System.out.print("Enter Employee ID: ");
        Eid = scanner.nextInt();
        System.out.print("Enter Basic Salary: ");
        Basic = scanner.nextDouble();
        scanner.close();
    }

 
    public void compute_net_sal() {
       
        DA = 0.52 * Basic;

       
        Gross_Sal = Basic + DA;

        
        double IT = 0.3 * Gross_Sal;

       
        Net_Sal = Gross_Sal - IT;
    }

  
    public void display() {
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + Ename);
        System.out.println("Employee ID: " + Eid);
        System.out.println("Basic Salary: " + Basic);
        System.out.println("DA: " + DA);
        System.out.println("Gross Salary: " + Gross_Sal);
        System.out.println("Net Salary: " + Net_Sal);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.read();
        emp.compute_net_sal();
        emp.display();
    }
}
