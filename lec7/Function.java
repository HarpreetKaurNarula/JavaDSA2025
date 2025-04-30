package lec7;

public class Function {
    public static void main(String[] args) {
        //you can change public static void main but for that u have to use open jdk//
        //void can be changed to whatever return type needed//
        System.out.println("hello");
        Add();
        System.out.println("bye");
    }
    public static void Add() {  //non parameterized//
        int a=7;
        int b=8;
        int c=a+b;
        Sub();
        System.out.println(c);
    }
    public static void Sub() {  //sub is called indirectly in add fuction through main//
        int a=7;
        int b=8;
        int c=a-b;
        System.out.println(c);
    } 
}
    