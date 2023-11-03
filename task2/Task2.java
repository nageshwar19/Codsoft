import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSubjects;
        double totalMarks = 0;
        double averagePercentage;
        
        System.out.print("Enter the number of subjects: ");
        totalSubjects = scanner.nextInt();

        if (totalSubjects <= 0) {
            System.out.println("Invalid number of subjects. Please enter a positive number.");
            return;
        }

        for (int i = 1; i <= totalSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + " (out of 100): ");
            double subjectMarks = scanner.nextDouble();
            
            if (subjectMarks < 0 || subjectMarks > 100) {
                System.out.println("Invalid marks. Marks should be between 0 and 100.");
                return;
            }
            
            totalMarks += subjectMarks;
        }
        
        averagePercentage = totalMarks / totalSubjects;

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        
        String grade = calculateGrade(averagePercentage);
        System.out.println("Grade: " + grade);
        
        scanner.close();
    }

    public static String calculateGrade(double percentage) {
        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
}
