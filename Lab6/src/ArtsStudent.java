
class ArtsStudent extends STUDENT {
    private String electiveSubject;

    public ArtsStudent(String name, int rollNo, int totalMarks, String electiveSubject) {
        super(name, rollNo, totalMarks);
        this.electiveSubject = electiveSubject;
    }

    public void displayElectiveSubject() {
        System.out.println("Elective Subject: " + electiveSubject);
    }
}