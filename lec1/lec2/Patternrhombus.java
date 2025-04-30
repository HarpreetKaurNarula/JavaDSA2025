package lec1.lec2;

public class Patternrhombus {
    public static void main(String[] args) {
        int n=3;
        int row=1;
        int star=1;
        int val=1;
        int space=n-1;

        while(row<=2*n-1){
            int i=1;
            //space//
            while(i<=space){
                System.out.print("\t");
                i++;
            }
            //star//
            int j=1;
            int p=val;
            while(j<=star){
                System.out.print(p+ "\t" );
                if(j<=star/2){
                    p++;
                }
                else{
                    p--;
                }
                j++;
                
            }
            if(row<n){
                space--;
                star+=2;
                val++;
            }
            else{
                space++;
                star-=2;
                val--;
            }
            System.out.println();
            row++;

        }
    }
    
}
    

