import java.util.Scanner;

public class inputoutput {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking full line input
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Another string for concat and comparison
        System.out.print("Enter another string: ");
        String str2 = sc.nextLine();

        System.out.println("\n----- STRING METHODS -----");

        // 1. Length
        System.out.println("Length = " + str.length());

        // 2. Uppercase
        System.out.println("Uppercase = " + str.toUpperCase());

        // 3. Lowercase
        System.out.println("Lowercase = " + str.toLowerCase());

        // 4. Concatenate
        System.out.println("Concatenate = " + str.concat(" " + str2));
}}
