package lec8;

public class Array1 {
    public static void main(String[] args) {
        int a;
        int [] arr=new int[5];  //gives the address of 1-D array//
        System.out.println(arr);
        int [] other = arr;
        arr[0]=10;
        arr[1]=1;
        arr[2]=20;
        arr[3]=56;
        arr[4]=2;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
           //this is not feasible for data types with large blocks like new int[1000] //
        System.out.println(other.length); //size of array//

        
    }
    
}
