package lec4;

public class Sumofdigits {
    public static void main(String[] args) {
        int n=3457;
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=sum=rem;
            n=n/10;
        }
        System.out.println(sum);
    }
}


    

