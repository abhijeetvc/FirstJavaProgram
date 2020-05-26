import java.util.Scanner;

public class WhileLoopDemo {

    void check1(){
        int i=1;
        while(i<=10){
            System.out.println("Print : "+i);
            i++;
        }
    }

    void check2(){
        int total=0;
        int i;
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter value for i: ");
        i=sc1.nextInt();
        while(i!=0){
          //  total+=i;
            total=total+i;
            //total=5
            //total=9
            //total=12
            //total=14
            //total=15
            i--;
        }
        System.out.println("Total = "+total);
    }

    void checkDoWhile(){
        int number;
        int total=0;

        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter number : ");
            number=sc.nextInt();
            total+=number;
        }while(number!=0);
        System.out.println("Total : "+total);
    }

    public static void main(String[] args){

        WhileLoopDemo wl=new WhileLoopDemo();
        wl.check1();
        wl.check2();
        wl.checkDoWhile();
    }
}
