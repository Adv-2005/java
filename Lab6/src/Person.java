

	class Person {
	    private String name;
	    private String birthDate;

	 
	    public Person(String name, String birthDate) {
	        this.name = name;
	        this.birthDate = birthDate;
	    }

	  
	    public String getName() {
	        return name;
	    }

	    public String getBirthDate() {
	        return birthDate;
	    }
	    
	    public static void main(String[] args) {
	        // Creating an object of Person
	        Person person = new Person("Alice", "1990-01-01");

	        // Creating an object of CollegeGraduate
	        CollegeGraduate graduate = new CollegeGraduate("Bob", "1995-05-15", 3.8, 2017);

	        // Displaying information
	        System.out.println("Person Details:");
	        System.out.println("Name: " + person.getName());
	        System.out.println("Birth Date: " + person.getBirthDate());

	        System.out.println("\nCollege Graduate Details:");
	        System.out.println("Name: " + graduate.getName());
	        System.out.println("Birth Date: " + graduate.getBirthDate());
	        System.out.println("GPA: " + graduate.getGpa());
	        System.out.println("Year of Graduation: " + graduate.getYearOfGraduation());
	    }
	}
