package studentinformationsystem;

public class StudentInformationSystem {
    public static void main(String[] args) {
   
    // i. Display student name and student ID
    String studentName = "Shotiraj A/L Chandran";
    String studentID = "S87310";

    System.out.println("Student Information System");
    System.out.println("Student Name: " + studentName);
    System.out.println("Student ID: " + studentID);
    
    // ii. Store two marks using variables
    int mark1 = 85;
    int mark2 = 90;

    // iii. Calculate the total mark
    int total = mark1 + mark2;

    // iv. Display the total
    System.out.println("Mark 1: " + mark1);
    System.out.println("Mark 2: " + mark2);
    System.out.println("Total Mark: " + total);
    
    // v. Display a message based on the total
    if (total >= 160) {
        System.out.println("Result: Excellent");
    } else if (total >= 100) {
        System.out.println("Result: Good");
    } else {
        System.out.println("Result: Needs Improvement");
    }
}
}