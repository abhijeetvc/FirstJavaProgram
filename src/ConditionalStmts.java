import java.util.Scanner;

class ConditionalStmts {

    //int a=9;

  //  int marks=80;   //A, B, C, D,E

    void checkGrade(){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks:");
        int marks=sc.nextInt();

        if(marks>=80){
            System.out.println("Grade A");
        }
        else if(marks>=70 && marks<80){
            System.out.println("Grade B");
        }
        else if(marks>=50 && marks<70){
            System.out.println("Grade C");
        }
        else {
            System.out.println("Grade D");
        }
    }

    void method1(){

    }

    void method2(){
        method1();
    }

    public static  void main(String[] args){
        ConditionalStmts cs=new ConditionalStmts();
        cs.checkGrade();
    }
}
