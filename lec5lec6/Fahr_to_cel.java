package lec5lec6;

public class Fahr_to_cel {
    public static void main(String[] args) {
        int minf=0;
        int maxf=100;
        int step=20;
        for(int i=minf;i<=maxf;i=i+step){
            int c=(int) ((5/9.0)*(i-32)); //typecasting//
            System.out.println(i + "\t" + c);
        }

    }
    
}
