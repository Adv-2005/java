

	class House extends Building {
	    private int bedrooms;
	    private int baths;

	    // Constructor
	    public House(int squareFootage, int stories, int bedrooms, int baths) {
	        super(squareFootage, stories);
	        this.bedrooms = bedrooms;
	        this.baths = baths;
	    }

	    // Getters and Setters
	    public int getBedrooms() {
	        return bedrooms;
	    }

	    public void setBedrooms(int bedrooms) {
	        this.bedrooms = bedrooms;
	    }

	    public int getBaths() {
	        return baths;
	    }

	    public void setBaths(int baths) {
	        this.baths = baths;
	    }
	}


