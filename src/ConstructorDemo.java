
//Types of Constructor: a) Default constructor
//                      b) No argument constructor
//                      c) Parameterized Constructor

import java.util.Scanner;

public class ConstructorDemo {

    int a;
    int b;

    public ConstructorDemo(){        //No argument Constructor
        System.out.println("------------");
    }
    public ConstructorDemo(int a,int b){   //Parametrized constructor
        System.out.println("+++++++++++++");
        this.a=a; //  a=a1;
        this.b=b; //  b=b1;
        addition();
        this.subtract();
        this.addition();
    }
    void addition(){
        int c=a+b;
        System.out.println("Addition : "+c);
    }

    void subtract(){
        int c1=a-b;
        System.out.println("Subtraction : "+c1);
    }
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value for a: ");
        int a=sc.nextInt();
        System.out.println("Enter value for b: ");
        int b=sc.nextInt();
      //  ConstructorDemo cd1=new ConstructorDemo();
        ConstructorDemo cd=new ConstructorDemo(a,b);   //default constructor invoked automatically once the object is created
//        cd.addition();
//        cd.subtract();
    }
}
