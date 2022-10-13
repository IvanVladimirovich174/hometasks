package thirdhometask.firstpart.task2;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("Ivan");
        student.setSurname("Meshkov");
        student.setGrades(new int[]{0, 1, 2, 3, 4});
        System.out.println(student);

        student.addGrade(5);
        System.out.println(student);

        student.setGrades(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100});
        System.out.println(student);

        student.addGrade(150);
        System.out.println(student);

        System.out.println(student.getName());
        System.out.println(student.getSurname());
        int[] grades = student.getGrades();
        for (int grade : grades) {
            System.out.print(grade + " ");
        }
    }
}
