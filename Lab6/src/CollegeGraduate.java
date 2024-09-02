
class CollegeGraduate extends Person {
    private double gpa;
    private int yearOfGraduation;

   
    public CollegeGraduate(String name, String birthDate, double gpa, int yearOfGraduation) {
        super(name, birthDate);
        this.gpa = gpa;
        this.yearOfGraduation = yearOfGraduation;
    }

   
    public double getGpa() {
        return gpa;
    }

    public int getYearOfGraduation() {
        return yearOfGraduation;
    }
}