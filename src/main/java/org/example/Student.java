package org.example;

public class Student {

    private String fio;
    private int groupName;
    private String papersNumber;

    public Student(String fio, int groupName, String papersNumber) {
        this.fio = fio;
        this.groupName = groupName;
        this.papersNumber = papersNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return papersNumber.equals(student.papersNumber);
    }

    @Override
    public int hashCode() {
        return papersNumber.hashCode();
    }

    @Override
    public String toString() {
        return "Student{" +
                "fio='" + fio + '\'' +
                ", groupName=" + groupName +
                ", papersNumber='" + papersNumber + '\'' +
                '}';
    }
}
