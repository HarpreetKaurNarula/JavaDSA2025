package lec5lec6;

public class decimaltobinary {
    public static void main(String[] args) {
        int num=140;
        int sum=0;
        int mul=1;
        while(num>0){
            int rem=num%2;
            sum+=rem*mul;
            num=num/2;
            mul=mul*10;

        }
        System.out.println(sum);

    }
    
}
