import java.util.Scanner;
public class p2 {
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        double price;
        double total=0;
        double min=Integer.MAX_VALUE;
        double max=Integer.MIN_VALUE;

        for (int i=1;i<=10;i++){
            System.out.println("Enter the price of items "+i+":");
            price=sc.nextDouble();
            total+=price;
         if(price<min){
            min=price;
         }   
         if(price>max){
            max=price;
         }
            } 
            System.out.println("maximum is "+max);
            System.out.println("minimum is "+min);
            double average=total/10;
            System.out.println("the avaerage is : "+average);
            sc.close();  
    } 
}
