package lec1.lec2;

public class Pattern13 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        int star=1;
        
        while(row<=2*n-1){
            int i=1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            //mirror//
            if(row<n){
                star++;
            }
            else{
                star--;
            }
            
            System.out.println();
            row++;
        }
        
    }
    
}
