import java.util.Scanner;

class Employee {

    private int empId;
    private String empName;
    private double salary;

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public double getSalary() {
        return salary;
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("Enter Employee ID: ");
        emp.setEmpId(sc.nextInt());

        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        emp.setEmpName(sc.nextLine());

        System.out.print("Enter Salary: ");
        emp.setSalary(sc.nextDouble());

        System.out.println("\nEmployee Details");
        System.out.println("ID: " + emp.getEmpId());
        System.out.println("Name: " + emp.getEmpName());
        System.out.println("Salary: " + emp.getSalary());

        sc.close();
    }
}