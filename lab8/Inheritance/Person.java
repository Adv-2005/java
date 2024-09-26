package Inheritance;

public class Person {
private String name;
private String dob;

Person(String name, String dob){
	this.name=name;
	this.dob=dob;
}
public String getName() {
	return name;
}
public String getDob() {
return dob;
}
public void displayPersonInfo() {
	System.out.println("Person Name: "+ name);
	System.out.println("Person Dob: "+ dob);
	
}
}
