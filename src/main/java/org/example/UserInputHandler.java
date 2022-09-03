package org.example;

import java.util.Scanner;

public class UserInputHandler {

    private String inputLine;
    private StudentsList studentsList;
    private Scanner myScan = new Scanner(System.in);

    public UserInputHandler(StudentsList studentsList) {
        this.studentsList = studentsList;
    }

    public void scan() {
        while (true) {
            System.out.println("Введите информацию о студенте: \"ФИО, номер группы, номер студенческого билета\"\n");
            inputLine = myScan.nextLine();
            if (inputLine.equals("end")) {
                System.out.println(studentsList);
                break;
            } else {
                this.studentsList.addStudent(new Student(inputLine.split(",")));
            }
        }
    }
}
