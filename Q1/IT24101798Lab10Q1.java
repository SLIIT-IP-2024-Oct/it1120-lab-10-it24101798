import java.util.Scanner;

public class IT24101798Lab10Q1 { 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a mark (0-100): ");
        int mark = scanner.nextInt();

        
        assert (mark >= 0 && mark <= 100) : "Invalid Mark"; 

        System.out.println("Mark is Validated.");

        
        String grade;
        if (mark >= 75) {
            grade = "A";
        } else if (mark >= 60) {
            grade = "B";
        } else if (mark >= 50) {
            grade = "C";
        } else if (mark >= 40) {
            grade = "D";
        } else {
            grade = "F";
        }

        
        assert (mark >= 75 && grade.equals("A")) || 
               (mark >= 60 && grade.equals("B")) || 
               (mark >= 50 && grade.equals("C")) || 
               (mark >= 40 && grade.equals("D")) || 
               (mark < 40 && grade.equals("F")) : "Incorrect Grade Assigned";

        System.out.println("Grade: " + grade); 
    }
}