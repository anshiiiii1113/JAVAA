
import java.util.Scanner;

public class multiplication {
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        int result = multiply(num1, num2);

        System.out.println("Product = " + result);

        sc.close();
    }
}
