public class LoopExamples {

    public static void main(String[] args){

        for(int i=1;i<=10;++i){
            System.out.println("Print : "+i);
        }
        int a=10;
        int b=20;
 //Pre-increment, pre-decrement, post-increment, post-decrement
        int c=a+++b++;
        System.out.println("Value of a: "+a);
        System.out.println("Value of b: "+b);
        int c1=a+--b;
        System.out.println("Value of C : "+c);
        System.out.println("Value of c1: "+c1);
        System.out.println("Value of a: "+a);
        System.out.println("Value of b: "+b);

        int c2=++a+b;
        int c3=a+++b;
        int c4=a+--b;
        int c5=a--+b;
        int c6=a+b--;
        int c7=b+++a;
        int c8=++b+a;
        int c9=--a+b;
        int c10=--b+a;

//        int c1=++a+b;
//        System.out.println("Value of C : "+c1);
    }
}
