import java.util.Scanner;

public class FactorialDemo {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. :");
        int num=sc.nextInt();

        int factorial=1;
//        for(int i=num;i>=1;i--){
//            factorial=factorial*i;
//        }

        for(int i=1;i<=num;i++){
            factorial=factorial*i;
        }
        System.out.println("Factorial of given no. is :"+factorial);
    }
}
