package lec1.lec2;

public class Pattern15 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        int star=n;
        int space=0;
        while(row<=n){
            int i=1;
            while(i<=star){
                System.out.print(" * ");
                i++;
            }
            int j=1;
            while(j<=space){
                System.out.print("     ");
                j++;
            }
            if(row<n){
                star--;
                space++;
            }
            else{
                star++;
                space--;
            }
            System.out.println();
            row++;
            

        }
    }
    
}


    
 
