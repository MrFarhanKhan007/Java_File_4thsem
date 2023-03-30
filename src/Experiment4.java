import java.util.Scanner;

public class Experiment4 {
    private int rollNumber;
    private String name;
    private int marks1;
    private int marks2;
    private int marks3;

    // Getter and setter methods for the data members
    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks1() {
        return marks1;
    }

    public void setMarks1(int marks1) {
        this.marks1 = marks1;
    }

    public int getMarks2() {
        return marks2;
    }

    public void setMarks2(int marks2) {
        this.marks2 = marks2;
    }

    public int getMarks3() {
        return marks3;
    }

    public void setMarks3(int marks3) {
        this.marks3 = marks3;
    }

    // Member function to get data from user
    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        this.rollNumber = scanner.nextInt();
        scanner.nextLine(); // consume the remaining newline character
        System.out.print("Enter Name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter Marks1: ");
        this.marks1 = scanner.nextInt();
        System.out.print("Enter Marks2: ");
        this.marks2 = scanner.nextInt();
        System.out.print("Enter Marks3: ");
        this.marks3 = scanner.nextInt();
    }

    // Member function to display student record
    public void display() {
        System.out.println("Roll Number: " + this.rollNumber);
        System.out.println("Name: " + this.name);
        System.out.println("Marks1: " + this.marks1);
        System.out.println("Marks2: " + this.marks2);
        System.out.println("Marks3: " + this.marks3);
    }

    // Member function to set data for the student record
    public void setData(int rollNumber, String name, int marks1, int marks2, int marks3) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public static void main(String[] args) {
        Experiment4 student = new Experiment4();
        student.getData();
        student.display();
    }
}
