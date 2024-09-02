package lab4;

public class Student {
    private String sname;
    private int[] marksArray;
    private int total;
    private double avg;

  
    public Student(String name, int[] marks) {
        this.sname = name;
        this.marksArray = marks;
    }

    
    public void assign() {
       
        total = 0;
        for (int mark : marksArray) {
            total += mark;
        }

    
        avg = (double) total / marksArray.length;
    }


    public void display() {
        System.out.println("Student Name: " + sname);
        System.out.println("Marks: " + java.util.Arrays.toString(marksArray));
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + avg);
    }

    public static void main(String[] args) {
        // Example usage
        int[] marks = {80, 75, 90}; // Replace with actual marks
        Student student = new Student("John Doe", marks);
        student.assign();
        student.display();
    }
}
