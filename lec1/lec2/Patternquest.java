package lec1.lec2;

public class Patternquest {
    public static void main(String[] args) {
        int n=4;
        int row=1;
        int star=1;
        int space=n+1;
        int val=1;
        while(row>=n){
            int i=1;
            int p=val;
            while(i<=star){
                System.out.print(p+ "");
                i++;
                p++;
            }
            int j=1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            int k=1;
            p--;
            if(row==n){
                k=2;
                p--;
            }
            while(k<=star){
                System.out.print(p+ "");
                k++;
                p--;
            }
            System.out.println();
            row++;
            star++;
            space-=2;
        }
    
    }
}
