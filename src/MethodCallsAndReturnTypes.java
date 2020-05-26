import java.util.Scanner;

public class MethodCallsAndReturnTypes {

   int addNos(int a,int b){
        int c=a+b;
       //System.out.println("Value of c:"+c);
       return c;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value for a:");
        int a1=sc.nextInt();
        System.out.println("Enter value for b:");
        int b1=sc.nextInt();

        MethodCallsAndReturnTypes m=new MethodCallsAndReturnTypes();
        int c1=m.addNos(a1,b1);
        System.out.println("Total:"+c1);
    }
}
