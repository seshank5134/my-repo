import java.util.Scanner;

public class StudentMarks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the number of students
        final int NUM_STUDENTS = 2;

        // Arrays to store student names and their marks in three subjects
        String[] studentNames = new String[NUM_STUDENTS];
        int[][] marks = new int[NUM_STUDENTS][3]; // 3 subjects for each student
        double[] averages = new double[NUM_STUDENTS]; // To store the average of each student

        double totalClassMarks = 0; // To store total marks of the class for calculating class average
        double classAverage;

        // Input student names and marks for each subject
        for (int i = 0; i < NUM_STUDENTS; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            studentNames[i] = scanner.nextLine();

            int totalMarks = 0;
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter marks for Subject " + (j + 1) + " for " + studentNames[i] + ": ");
                marks[i][j] = scanner.nextInt();
                totalMarks += marks[i][j]; // Accumulate marks for total
            }
            scanner.nextLine(); // Consume newline after integer input

            // Calculate the average marks for each student
            averages[i] = totalMarks / 3.0;
            totalClassMarks += totalMarks; // Accumulate the total marks for the class
        }

        // Calculate the class average
        classAverage = totalClassMarks / (NUM_STUDENTS * 3.0);

        // Display the class average
        System.out.printf("\nClass Average Marks: %.2f\n", classAverage);

        // Display the students who scored above the class average
        System.out.println("\nStudents with average marks greater than class average:");
        for (int i = 0; i < NUM_STUDENTS; i++) {
            if (averages[i] > classAverage) {
                System.out.println(studentNames[i] + " with average marks: " + averages[i]);
            }
        }

        scanner.close();
    }
}
