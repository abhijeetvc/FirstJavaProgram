public class ArrayExample {

    //int[] arr; //array declaration
    public static void main(String[] arg){
        int[] arr=new int[5];
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);

        arr[2]=40;
        arr[3]=50;
        arr[0]=10;

       // int[] arr1={5,10,20};
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }
        int[] a={1,2,3,4,5,6,7,8,9,10};
        int c=a[0]+5;
        System.out.println("value of c: "+c);
    }
}



