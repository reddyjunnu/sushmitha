package project1;
import java.util.Scanner;

public class StudentMarksPercentage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                System.out.print("Enter marks for subject 1: ");
                int year = scanner.nextInt();
                int subject1Marks = scanner.nextInt();
                System.out.print("Enter marks for subject 2: ");
                int subject2Marks = scanner.nextInt();
                System.out.print("Enter marks for subject 3: ");
                int subject3Marks = scanner.nextInt();
                int totalMarks = subject1Marks + subject2Marks + subject3Marks;
                double percentage = (totalMarks / 300.0) * 100;
                System.out.println("Total Marks: " + totalMarks);
                System.out.println("Percentage: " + percentage + "%");

                scanner.close();
            }
        }
