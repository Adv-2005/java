
	class ScienceStudent extends STUDENT {
	    private int practicalMarks;

	    public ScienceStudent(String name, int rollNo, int totalMarks, int practicalMarks) {
	        super(name, rollNo, totalMarks);
	        this.practicalMarks = practicalMarks;
	    }

	    @Override
	    public void compute() {
	        totalMarks += practicalMarks;
	        int averageMarks = totalMarks / 6; // Assuming 5 subjects + 1 practical
	        System.out.println("Total Marks (including practical): " + totalMarks);
	        System.out.println("Average Marks: " + averageMarks);
	    }

	    public void displayPracticalMarks() {
	        System.out.println("Practical Marks: " + practicalMarks);
	    }
	}


