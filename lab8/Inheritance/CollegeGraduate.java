package Inheritance;

public class CollegeGraduate extends Person {
private double gpa;
private int gradYear;
CollegeGraduate(String name, String dob, double gpa, int gradYear){
	super(name,dob);
	this.gpa=gpa;
	this.gradYear=gradYear;
}
public double getGPA() {
	return gpa;
}
public int getgradYear() {
return gradYear;
}
public void displayCollegegradInfo() {
	
	displayPersonInfo();
	System.out.println("GPA: "+ gpa);
	System.out.println("Graduation Year: " + gradYear);
}
}
