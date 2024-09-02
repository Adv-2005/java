
class Results extends q6 implements Sports, Exam {
    private int s_grade;
    private int e_grade;
    private String finalResult;

    // Constructor
    public Results(String name, int id, int s_grade, int e_grade, String finalResult) {
        super(name, id);
        this.s_grade = s_grade;
        this.e_grade = e_grade;
        this.finalResult = finalResult;
    }

    // Implementing Sports interface methods
    @Override
    public void setSGrade(int grade) {
        this.s_grade = grade;
    }

    @Override
    public int getSGrade() {
        return s_grade;
    }

    // Implementing Exam interface methods
    @Override
    public void setEGrade(int grade) {
        this.e_grade = grade;
    }

    @Override
    public int getEGrade() {
        return e_grade;
    }

    // Method to display the final result
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Sports Grade: " + s_grade);
        System.out.println("Exam Grade: " + e_grade);
        System.out.println("Final Result: " + finalResult);
    }
}