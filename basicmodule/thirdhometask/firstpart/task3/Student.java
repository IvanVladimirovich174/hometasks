package basicmodule.thirdhometask.firstpart.task3;

import java.util.Arrays;

public class Student implements Comparable<Student> {
    private String name;
    private String surname;
    private int[] grades;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        if (grades.length <= 10) {
            this.grades = grades.clone();
        } else {
            this.grades = new int[10];
            System.arraycopy(grades, grades.length - 10, this.grades, 0, 10);
        }
    }

    public void addGrade(int grade) {
        if (grades.length < 10) {
            int[] newGrades = new int[grades.length + 1];
            System.arraycopy(grades, 0, newGrades, 0, grades.length);
            newGrades[newGrades.length - 1] = grade;
            grades = newGrades;
        } else {
            for (int i = 0; i < grades.length - 1; ++i) {
                grades[i] = grades[i + 1];
            }
            grades[grades.length - 1] = grade;
        }
    }

    public double averageGrade() {
        int sum = 0;

        for (int grade : grades) {
            sum += grade;
        }
        return 1.0 * sum / grades.length;
    }

    @Override
    public int compareTo(Student o) {
        return this.surname.compareTo(o.surname);
    }

    @Override
    public String toString() {
        return name + " " + surname + ": "
                + Arrays.toString(grades) + "\n"
                + "Average: " + averageGrade() + "\n";
    }
}
