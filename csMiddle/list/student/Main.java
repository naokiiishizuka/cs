package csMiddle.list.student;

class Student {
    private String studentId;
    private String firstName;
    private String lastName;
    public int gradeLevel;

    public Student(String studentId, String firstName, String lastName, int gradeLevel) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradeLevel = gradeLevel;
    }

    public String getStudentInfo() {
        return studentId + ": " + firstName + " " + lastName + "(" + gradeLevel + "gr)";
    }
}
class MyClass{
    public static void main(String[] args){
        Student student1 = new Student("AC-343424", "James", "Smith", 6);
        System.out.println(student1.getStudentInfo());

        Student student2 = new Student("AC-343428", "Maria", "Garcia", 5);
        System.out.println(student2.getStudentInfo());

        Student student3 = new Student("AC-343434", "Robert", "Johnson", 3);
        System.out.println(student3.getStudentInfo());
    }
}