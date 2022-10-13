package thirdhometask.firstpart.task3;

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

    public void sortBySurname(Student[] students) {
        Arrays.sort(students);
    }
}