public class BlocksDemo {

    static{
        System.out.println("Hiiiiiiiiiiiiii");
    }

    static void getData(){
        System.out.println("Hellooooooo");
        getData1();
    }

    static void getData1(){
      //  getData();
        System.out.println("111111111111");
    }
    public static void main(String[] args){
        BlocksDemo bd=new BlocksDemo();
        bd.getData1();
       // BlocksDemo.getData();
    }
}
