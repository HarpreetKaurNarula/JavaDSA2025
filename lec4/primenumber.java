package lec4;

public class primenumber {
    public static void main(String[] args) {
        int n=13;
        int count=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                count++;
                break;
            }
        }
        if(count>=1){
            System.out.print("it is not prime");
        }
        else{
            System.out.println("it is prime");
        }
    }
}
    

