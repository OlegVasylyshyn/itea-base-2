package week3.student;

import java.util.UUID;

public class StudentGroup {

    private int size;
    private Node[] students = new Node[10];

    public void add(Student student) {
        if(size >= students.length) {
            copyArray();
        }
        Node node = new Node(student);
        students[size++] = node;
    }

    private void copyArray() {
        Node[] tmp = new Node[students.length * 2];
        System.arraycopy(students, 0, tmp, 0, students.length);
        students = tmp;
    }


    public void removeByName(String name) {
        // TODO: 2/21/18 implement removing student
    }

    private static class Node {

        // GUID
        public String id = UUID.randomUUID().toString();
        public Student student;

        public Node(Student student) {
            this.student = student;
        }

    }
}
