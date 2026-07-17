public class method {

    
    static int num = 20;

    
    void add(int value) {
        int sum = num + value;

        System.out.println("Static Variable = " + num);
        System.out.println("Input Value = " + value);
        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) {

        method obj = new method();

        obj.add(30);
    }
}