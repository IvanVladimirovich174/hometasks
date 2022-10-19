package thirdhometask.firstpart.task3;

public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        Student s1 = new Student();

        s1.setName("Gavin");
        s1.setSurname("King");
        s1.setGrades(new int[]{3, 3, 3, 3, 3});

        Student s2 = new Student();
        s2.setName("Rod");
        s2.setSurname("Johnson");
        s2.setGrades(new int[]{4, 4, 2, 4, 4, 4});
        s2.addGrade(2);

        Student s3 = new Student();
        s3.setName("James");
        s3.setSurname("Gosling");
        s3.setGrades(new int[]{5, 5, 5, 5, 5, 5, 5});

        Student s4 = new Student();
        s4.setName("Joshua");
        s4.setSurname("Bloch");
        s4.setGrades(new int[]{1, 2, 3, 4});

        Student[] students = {s1, s2, s3, s4};
        System.out.println("Best student");
        System.out.println(studentService.bestStudent(students));
        System.out.println();

        System.out.println("Initial array before sort:");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();

        System.out.println("New array after sort:");
        Student[] studentsAfterSort = studentService.sortBySurname(students);
        for (Student student : studentsAfterSort) {
            System.out.println(student);
        }
        System.out.println();

        System.out.println("Initial array after sort :");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();
    }
}
