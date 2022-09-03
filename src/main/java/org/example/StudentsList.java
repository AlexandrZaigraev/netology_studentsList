package org.example;

import java.util.HashSet;

public class StudentsList {
    private HashSet<Student> students;

    public StudentsList() {
        this.students = new HashSet<>();
    }

    public void addStudent(Student student) {

        var isAdded = this.students.add(student);
        if (isAdded){
            System.out.println("Студент добавлен " + student);
        } else {
            System.out.println("Такой студент уже есть");
        }

    }

    @Override
    public String toString() {
        return students.toString();
    }
}
