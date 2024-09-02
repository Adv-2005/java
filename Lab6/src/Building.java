

	class Building {
	    private int squareFootage;
	    private int stories;

	    // Constructor
	    public Building(int squareFootage, int stories) {
	        this.squareFootage = squareFootage;
	        this.stories = stories;
	    }

	    // Getters and Setters
	    public int getSquareFootage() {
	        return squareFootage;
	    }

	    public void setSquareFootage(int squareFootage) {
	        this.squareFootage = squareFootage;
	    }

	    public int getStories() {
	        return stories;
	    }

	    public void setStories(int stories) {
	        this.stories = stories;
	    }
	    
	    public static void main(String[] args) {
	        // Creating a House object
	        House myHouse = new House(2000, 2, 3, 2);
	        System.out.println("House: " + myHouse.getSquareFootage() + " sqft, " + myHouse.getStories() + " stories, " + myHouse.getBedrooms() + " bedrooms, " + myHouse.getBaths() + " baths");

	        // Creating a School object
	        School mySchool = new School(5000, 3, 20, "Elementary");
	        System.out.println("School: " + mySchool.getSquareFootage() + " sqft, " + mySchool.getStories() + " stories, " + mySchool.getClassrooms() + " classrooms, " + mySchool.getGradeLevel() + " level");
	    }
	}

