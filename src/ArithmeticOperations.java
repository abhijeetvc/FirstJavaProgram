import java.util.Scanner;

public class ArithmeticOperations {

    void addNumbers(int a,int b){
        int c=a+b;
        System.out.println("Addition is:"+c);
    }

    void subtractNumbers(int a,int b){
        int c=a-b;
        System.out.println("Subtraction is: "+c);
    }

    void multiplyNumbers(int a,int b){
        int c=a*b;
        System.out.println("Multiplication is: "+c);
    }

    void divideNumbers(int a,int b){
        int c=a/b;
        System.out.println("Division is: "+c);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value for a :");
        int a1=sc.nextInt();
        System.out.println("Enter value for b :");
        int b1=sc.nextInt();
        ArithmeticOperations ao=new ArithmeticOperations();

        ao.addNumbers(a1,b1);
        ao.subtractNumbers(a1,b1);
        ao.multiplyNumbers(a1,b1);
        ao.divideNumbers(a1,b1);
    }
}
