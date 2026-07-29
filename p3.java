
import java.util.Scanner;


public class p3 {
    public static void main(String[] args){
    // Scanner sc =new Scanner(System.in);
    // System.out.println("enter the number of elements : ");

    // int n=sc.nextInt();
    // int[] arr = new int[n];
    // for(int i =0;i<n;i++){
    //     arr[i]=sc.nextInt();}
    //     int start=0;
    //     int end =n-1;
    //     int temp;
    //     while(start<end){
    //         temp=arr[start];
    //         arr[start]=arr[end];
    //         arr[end]=temp;
    //         start++;
    //         end--;
    //     }
    //     for (int i= 0;i<n;i++) {
    //         System.out.print(arr[i]);
            
    //     }
    //     sc.close();

    //new code
    // Scanner sc =new Scanner(System.in);
    // int n=sc.nextInt();
    // int fact=1;
    // for(int i=1;i<=n;i++){
    //     fact=fact*i;

    // }   
    //     System.out.println(fact);
    // sc.close();
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    for(int i=1;i<=10;i++){
        System.out.println(num + " x " + i +" = " + (num*i));
    }
    sc.close();
 }


    }
/*
Scanner sc=new Scanner(System.in);
int n =sc.nextInt();
int[]arr=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
int start=0;
int end=n-1;
int temp;

while(start<end){
temp=arr[start];
arr[start]=arr[end];
arr[end]=temp;
}
for(int i=n-1;i<=0;i--)

*/