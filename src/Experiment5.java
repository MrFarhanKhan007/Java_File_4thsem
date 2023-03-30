import java.util.Scanner;

class Employee {
    String name, id, designation;
    double salary;

    Employee(String name, String id, String designation, double salary) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.salary = salary;
    }

    void inc_sal() {
        if (designation.equals("Manager")) {
            salary += 5000;
        } else if (designation.equals("General Manager")) {
            salary += 10000;
        } else if (designation.equals("CEO")) {
            salary += 20000;
        } else if (designation.equals("Worker")) {
            salary += 2000;
        }
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}

public class Experiment5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Employee ID: ");
        String id = sc.nextLine();
        System.out.print("Enter Employee Designation: ");
        String designation = sc.nextLine();
        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(name, id, designation, salary);
        emp.inc_sal();
        emp.display();
    }
}
