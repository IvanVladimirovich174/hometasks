package basicmodule.thirdhometask.firstpart.task3;

import java.util.Arrays;

public class StudentService {
    public Student bestStudent(Student[] students) {
        double bestAvg = students[0].averageGrade();
        Student bestStudent = students[0];

        double currentAvg;

        for (int i = 1; i < students.length; i++) {
            currentAvg = students[i].averageGrade();
            if (currentAvg > bestAvg) {
                bestStudent = students[i];
                bestAvg = currentAvg;
            }
        }
        return bestStudent;
    }

    public Student[] sortBySurname(Student[] students) {
        Student[] sortedArray = new Student[students.length];

        System.arraycopy(students,0,sortedArray,0,students.length);
        Arrays.sort(sortedArray);
        return sortedArray;
    }
}