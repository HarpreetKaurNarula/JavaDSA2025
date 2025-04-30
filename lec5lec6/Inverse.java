package lec5lec6;

public class Inverse {
    public static void main(String[] args) {
        int n=32145;
        int sum=0;
        int pos=1;
        while(n>0){
            int rem=n%10;
            sum=(int) (sum+pos*Math.pow(10,rem-1)); //it has double value so typecasting needs to be done//
            sum+=pos*Math.pow(10,rem-1); //internal typecasting is done//
            n=n/10;
            pos++;
            
        }
        System.out.println(sum);
    }
}
        