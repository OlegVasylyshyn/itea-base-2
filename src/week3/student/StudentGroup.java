package week3.student;

public class StudentGroup {

    private int size;
    private Student[] students = new Student[10];


    public void add(Student student) {
        if(size >= students.length) {
            copyArray();
        }
        students[size++] = student;
    }

    private void copyArray() {
        Student[] tmp = new Student[students.length * 2];
        System.arraycopy(students, 0, tmp, 0, students.length);
        students = tmp;
    }


    public void removeByName(String name) {
        // TODO: 2/21/18 implement removing student
    }
}
