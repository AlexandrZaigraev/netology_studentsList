package org.example;

import java.util.HashSet;

public class StudentsList {
    private HashSet<Student> students;

    public StudentsList() {
        this.students = new HashSet<>();
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    @Override
    public String toString() {
        return students.toString();
    }
}
