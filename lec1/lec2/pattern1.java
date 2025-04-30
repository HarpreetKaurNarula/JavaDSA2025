package lec1.lec2;

public class pattern1 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        int star=n; //first roe ke star print karega//
        while(row<=n){
            int i=1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            row++;
        }
    }
}
