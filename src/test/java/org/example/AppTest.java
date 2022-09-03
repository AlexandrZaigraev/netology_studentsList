package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class AppTest {
    @Test
    public void test_addStudentSize() {
        StudentsList studentsList = new StudentsList();
        studentsList.addStudent(new Student("zxc", "564-B", "257"));

        assertEquals(1, studentsList.getStudents().size(),
                "список студентов != 1 студент");
    }

    @Test
    public void test_addStudent() {
        StudentsList studentsList = new StudentsList();
        Student expectedStudent = new Student("zxc", "564-B", "257");
        studentsList.addStudent(expectedStudent);

        assertTrue(studentsList.getStudents().contains(expectedStudent),
                "список студентов не содержит студента");
    }

    @Test
    public void test_addTwoStudents() {
        StudentsList studentsList = new StudentsList();
        studentsList.addStudent(new Student("zxc", "564-B", "257"));
        studentsList.addStudent(new Student("zxc", "564-B", "257"));

        assertEquals(1, studentsList.getStudents().size(),
                "список студентов != 1 студент");
    }
}
