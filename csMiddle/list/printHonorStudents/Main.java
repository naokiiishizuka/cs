package csMiddle.list.printHonorStudents;

import java.util.List;

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

class Classroom {
    public Student[] students;
    private String courseName;
    public String teacher;

    public Classroom(Student[] students, String courseName, String teacher) {
        this.students = students;
        this.courseName = courseName;
        this.teacher = teacher;
    }

    public String getClassIdentity(){
        return this.courseName + " managed by " + this.teacher;
    } // 教室の情報を「科目名 managed by 教員名」として返します。

    public int getNumberOfStudents() {
        return this.students.length;
    }
}

class MyClass{
    public static void main(String[] args){
        Student[] students1 = {new Student("AC-343424", "James", "Smith", 6),
                new Student("AC-343428", "Maria", "Garcia", 5),
                new Student("AC-343434", "Robert", "Johnson", 3),
                new Student("AC-343454","Danny", "Robertson",10)
        };
        Classroom classroom1 = new Classroom(students1, "Algebra II", "Emily Theodore");

        Student[] students2 = {new Student("AC-340014","Kent", "Carter",9),
                new Student("AC-340024","Isaiah", "Chambers",10),
                new Student("AC-340018","Leta", "Ferguson", 7)};

        Classroom classroom2 = new Classroom(students2, "English", "Daniel Pherb");

        Classroom[] school = {classroom1, classroom2};
        printHonorStudents(school);
    }

    private static void printHonorStudents(Classroom[] school) {
        for(Classroom classroom: school) {
            for(Student student: classroom.students) {
                if(student.gradeLevel >= 10) {
                    System.out.println(student.getStudentInfo() + " from " + classroom.teacher + "'s class");
                }
            }
        }
    }
}