import java.util.Scanner;
class p1{
    public static void main(String[] args){
        int total =0;
        Scanner sc= new Scanner(System.in);
        for (int i=1;i<=5;i++){
         System.out.println("enter the marks for subject " + i +": ");
            int marks=sc.nextInt();
            total+=marks;
            
        }
        int percentage=(total/5);
        System.out.println("percentage :" +percentage);

        sc.close();
    }

}