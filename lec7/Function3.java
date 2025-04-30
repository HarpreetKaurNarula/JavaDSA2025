package lec7;

public class Function3 {
    public static void main(String[] args) {
        System.out.println("hello");
        
        System.out.println(Add());
    }
    public static int Add() {  //non parameterized //
        int a=7;
        int b=8;
        int c=a+b-sub();
        return c;
    }
    public static int sub() {  
        int a=3;
        int b=5;
        int c=a-b;
        return c;
    }
    
}
