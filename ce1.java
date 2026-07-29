import java.util.Scanner;
public class ce1 {
    public static void main(String[] args) {
    //     int n = 3;

    //     for (int i = 1; i <= n; i++) {
    //         // Print leading spaces
    //         for (int j = 1; j <= n - i; j++) {
    //             System.out.print("*");
    //         }

    //         // Print the number
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print(i);
    //         }

    //         System.out.println();
    //     }
    // }



    
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();

        int vowels = 0, consonants = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);

        sc.close();
    }
}
