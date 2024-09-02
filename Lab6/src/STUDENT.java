
public class STUDENT {
	private String name;
    private int rollNo;
    protected int totalMarks;

    public STUDENT(String name, int rollNo, int totalMarks) {
        this.name = name;
        this.rollNo = rollNo;
        this.totalMarks = totalMarks;
    }

    public void compute() {
        int averageMarks = totalMarks / 5; // Assuming 5 subjects
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
    

        public static void main(String[] args) {
            // Creating objects of STUDENT, ScienceStudent, and ArtsStudent
            STUDENT student = new STUDENT("Alice", 101, 400);
            ScienceStudent scienceStudent = new ScienceStudent("Bob", 102, 450, 50);
            ArtsStudent artsStudent = new ArtsStudent("Charlie", 103, 420, "History");

            // Displaying information and computing marks
            student.display();
            student.compute();

            System.out.println();

            scienceStudent.display();
            scienceStudent.compute();
            scienceStudent.displayPracticalMarks();

            System.out.println();

            artsStudent.display();
            artsStudent.compute();
            artsStudent.displayElectiveSubject();

            // Demonstrating dynamic polymorphism
            STUDENT ref;
            ref = scienceStudent;
            ref.compute(); // Calls ScienceStudent's compute method

            ref = artsStudent;
            ref.compute(); // Calls ArtsStudent's compute method
        }
    }
