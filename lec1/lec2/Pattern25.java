package lec1.lec2;

public class Pattern25 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        int star=1;
        int val=1;
        int space=n-1;

        while(row<=n){
            int i=1;
            //space//
            while(i<=space){
                System.out.print("\t");
                i++;
            }
            //star//
            int j=1;
           // int val=1; used to reset the value again from 1//
            while(j<=star){
                System.out.print(val+ "\t" );
                j++;
                val++;
            }
            System.out.println();
            row++;
            space--;
            star+=2;

        }
    }
    
}
