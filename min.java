import java .util.Scanner;
public class min {
    public static void main(String[] args) {
    //  int[] arr = {5, 2, 9, 1, 5, 6};
    //  int min = arr[0];

    //     for (int i = 1; i < arr.length; i++) {
    //     if (arr[i] < min) {
    //   min = arr[i];
    //         }
    //     }

    // System.out.println("The minimum value in the array is: " + min);
    // }
    Scanner sc= new Scanner(System.in);
    int num=sc.nextInt();
    boolean prime=true;
    if(num<2){
        prime=false;
    }
    else{
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                prime=false;
                break;
            }
        }
    }
    if(prime){
        System.out.println("Prime");

    }
    else{
        System.out.println("Not Prime");
    }
    sc.close();
}}
