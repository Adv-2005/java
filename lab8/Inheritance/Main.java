package Inheritance;

public class Main {
public static void main(String args[]) {
	Person p1= new Person("Aditya","18/12/2005");
	p1.displayPersonInfo();
	
	CollegeGraduate c1 = new CollegeGraduate("Sakshi","4/4/2005",7.5,2027);
	c1.displayCollegegradInfo();
}
}
