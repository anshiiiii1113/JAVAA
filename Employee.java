import java.util.Scanner;

public class Employee {

    // Instance variables
    int id;
    String name;

    // Static variable
    static int count = 0;

    // Constructor
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
        count++; // Increase count whenever an object is created
    }

    
    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Count: " + count);
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee[] emp = new Employee[3];
        int n= sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("Enter details of Employee " + (i + 1));

            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // Consume newline

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            emp[i] = new Employee(id, name);

            System.out.println("Total Employees Created = " + Employee.count);
            System.out.println();
        }

        System.out.println("Employee Details");

        for (int i = 0; i < n; i++) {
            emp[i].display();
        }

        sc.close();
    }
} 
