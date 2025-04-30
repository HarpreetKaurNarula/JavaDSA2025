package lec5;

public class Bintodec {
    public static void main(String[] args) {
        int num=101101;
        int sum=0;
        int mul=1;
        while(num>0){
            int rem=num%10;
            sum+=rem*mul;
            num=num/10;
            mul=mul*2;

        }
        System.out.println(sum);

    }
    
}

    

