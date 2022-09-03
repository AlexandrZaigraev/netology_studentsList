package org.example;

public class Student {

    private String fio;
    private String groupName;
    private String papersNumber;

    public Student(String fio, String groupName, String papersNumber) {
        this.fio = fio;
        this.groupName = groupName;
        this.papersNumber = papersNumber;
    }

    public Student(String[] value) {
        this.fio = value[0].trim();
        this.groupName = value[1].trim();
        this.papersNumber = value[2].trim();
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
