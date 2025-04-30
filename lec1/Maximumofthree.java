package lec1;

public class Maximumofthree {
    public static void main(String[] args) {
        int a=56, b=23, c=100;
        if(a>b & a>c){
            System.out.println("a");
        }
        else if(b>a & b>c){
            System.out.println("b");
        }
        /*if (b>a & b>c){
            System.out.println("b"); //in this both the if will work //
        }*/
        else{
            System.out.println("c");
        }
        
    }
    
}
