package lec5lec6;

import java.util.Scanner;

public class Typechar {
    public static void main(String[] args) {
        char ch='a';
        System.out.println( (int)ch);
        ch++; //ch=(char) ch+1; implicit datatype//
        System.out.println(ch);
        ch=(char)(ch+1); //explicit datatype//
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);
        System.out.println(ch);
    }
    
}
