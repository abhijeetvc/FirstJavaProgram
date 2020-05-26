public class HelloWorld {

    int a=10; //declaration
   // a=10;
    
    public static void main(String[] args){
        HelloWorld hw=new HelloWorld();
        int a=20;  //local variable
        System.out.println("value of a :"+hw.a);
        System.out.println("Value of inner variable a:"+a);
       // System.out.println("Hello Java____"+args[0]+" "+args[1]);
        
        boolean flag = false;
        if(flag) {
            System.out.println("Booelan value : " + true);
        }
        else{
            System.out.println("Boolean value : "+false);
        }

        byte value= -128; // -128 to 127
        System.out.println("byte value : "+value);

        short value1= -32767; // -32768 to 32767
        System.out.println("Short value : "+value1);

        int value2=425000000;  //-2^31 to (2^31)-1
        System.out.println("Value of int : "+value2);

        long value3=4250000000l; //-2^63 to (2^63)-1
        System.out.println("Value of int : "+value3);

        double value4=50000.5678;
        System.out.println("Double value : "+value4);

        float value5=45.5f;
        System.out.println("Float value : "+value5);

        char value6=67;
        System.out.println("Char value : "+value6);
    }
}

