import java.util.Scanner;

public class countevenodd {
    public static void main(String[] args) {
       int evenCount = 0;
       int oddCount = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Array elements are:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nCount of even numbers: " + evenCount);
        System.out.println("Count of odd numbers: " + oddCount);

        sc.close();
    }
}