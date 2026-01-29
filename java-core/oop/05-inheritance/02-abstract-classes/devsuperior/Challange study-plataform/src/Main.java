import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many lessons have in the course: ");
        int quantity = scanner.nextInt();

        List<Lesson> lessonList = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            System.out.println("Data of #" + (i+1) + " lesson:");
            System.out.print("Video or Task (v/t): ");
            char videoOrTask = scanner.next().toLowerCase().charAt(0);

            System.out.print("Title: ");
            scanner.nextLine();
            String title = scanner.nextLine();

            Lesson lesson;
            if (videoOrTask == 'v') {
                System.out.print("URL: ");
                String url = scanner.nextLine();
                System.out.print("Duration in seconds: ");
                int seconds = scanner.nextInt();
                lesson = new Video(title, url, seconds);
            } else {
                System.out.print("Description: ");
                String description = scanner.nextLine();
                System.out.print("How many questions: ");
                int questions = scanner.nextInt();

                lesson = new Task(title, description, questions);
            }

            lessonList.add(lesson);
        }

        int total = 0;
        for ( Lesson lesson : lessonList ) {
            total += lesson.duration();
        }
        System.out.println("Total duration of this course: " + total + " seconds.");
    }
}