
public class q6 {
	String name;
    int id;

    // Constructor
    public q6(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    
    public static void main(String[] args) {
        // Creating a Results object
        Results studentResult = new Results("John Doe", 123, 85, 90, "Pass");
        
        // Displaying the final result
        studentResult.display();
    }

}

interface Sports {
    void setSGrade(int grade);
    int getSGrade();
}

// Interface for Exam
interface Exam {
    void setEGrade(int grade);
    int getEGrade();
}



