package lec1;

public class patterm {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        while(row<=n){
            int i=1;
            while(i<=n){
                System.out.print("*");
                i++;
            }
            System.out.println();
            row++;
        }
    }
    
}
