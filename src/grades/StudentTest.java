package grades;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("Meadow");
        s1.addGrade(90);
        s1.addGrade(85);
        s1.addGrade(95);
        System.out.println(s1.getName() + "'s average grade is " + s1.getGradeAverage());

        Student s2 = new Student("Jabari");
        s2.addGrade(84);
        s2.addGrade(99);
        s2.addGrade(87);
        System.out.println(s2.getName() + "'s average grade is " + s2.getGradeAverage());

        Student s3 = new Student("Spot");
        s3.addGrade(100);
        s3.addGrade(90);
        s3.addGrade(95);
        System.out.println(s3.getName() + "'s average grade is " + s3.getGradeAverage());

        Student s4 = new Student("Arlo");
        s4.addGrade(85);
        s4.addGrade(88);
        s4.addGrade(97);
        System.out.println(s4.getName() + "'s average grade is " + s4.getGradeAverage());
    }
}

