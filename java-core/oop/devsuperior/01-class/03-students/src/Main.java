import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student student = new Student();

        System.out.print("First grade: ");
        student.firstGrade = scanner.nextDouble();
        System.out.print("Second grade: ");
        student.secondGrade = scanner.nextDouble();
        System.out.print("Third grade: ");
        student.thirdGrade = scanner.nextDouble();


        System.out.println("Total grade: " + student.totalGrade());
        System.out.println(student);
    }
}