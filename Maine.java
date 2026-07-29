import java.util.Scanner;


class Employee {

    private int id;
    private String name;
    private double salary;

    public void setDetails(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    
    public void display() {
        System.out.println("Employee Details");
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);
    }
}

class Manager extends Employee {

    private double bonus;

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public void display() {
        System.out.println("\nManager Details");
        System.out.println("ID : " + getId());
        System.out.println("Name : " + getName());
        System.out.println("Salary : " + getSalary());
        System.out.println("Bonus : " + bonus);
        System.out.println("Total Salary : " + (getSalary() + bonus));
    }
}

public class Maine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Bonus: ");
        double bonus = sc.nextDouble();

        
        Employee emp = new Manager();

    
        emp.setDetails(id, name, salary);

        
        Manager m = (Manager) emp;
        m.setBonus(bonus);

        
        emp.display();

        sc.close();
    }
}