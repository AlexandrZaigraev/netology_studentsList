package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        UserInputHandler userInputHandler = new UserInputHandler(new StudentsList());
        userInputHandler.scan();

        StudentsList studentsList = new StudentsList();
        studentsList.addStudent(new Student("Aboba", 555, "123"));
        studentsList.addStudent(new Student("Boboba", 555, "456"));
        studentsList.addStudent(new Student("Zoboba", 555, "789"));
        studentsList.addStudent(new Student("Kiril", 368, "1234"));
        studentsList.addStudent(new Student("Kiril", 368, "1234"));// этот студент не будет добавлен

        System.out.println(studentsList);
    }
}
