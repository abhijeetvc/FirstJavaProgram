public class AccessSpecifierDemo {

    int a=10;

    void getData(){
        System.out.println("Hiiiiii");
    }
    public static void main(String[] args){
        AccessSpecifierDemo as=new AccessSpecifierDemo();
        System.out.println("value of a: "+as.a);
        as.getData();

        AccessSpecifierDemo1 as1=new AccessSpecifierDemo1();
        as1.getData2();
        as1.getData1();
        System.out.println("Value of b : "+as1.b);
    }
}

class AccessSpecifierDemo1{
    protected int b=20;

    protected void getData1(){
        System.out.println("Helloooooooo");
    }

    void getData2(){
        System.out.println("Heyyyyyyyyy");
      //  getData1();
    }
}