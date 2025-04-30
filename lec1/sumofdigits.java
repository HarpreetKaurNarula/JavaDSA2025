package lec1;

public class sumofdigits {
    public static void main(String[] args) {
        int n=98756, sum=0;
        while (n!=0){
            sum+=n%10;
            n=n/10;

            System.out.println(sum);

        }
        
    }
    
}
