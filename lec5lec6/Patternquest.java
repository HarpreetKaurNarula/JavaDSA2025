package lec5;

public class Patternquest {
    public static void main(String[] args) {
        int n=4;
        int row=1;
        int star=1;
        int space=n+1;
        while(row>=n){
            int i=1;
            int val=1;
            while(i<=star){
                System.out.print(val+ "");
                i++;
                val++;
            }
            int j=1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            int k=1;
            while(k<=star){
                System.out.print("* ");
                k++;
            }
            System.out.println();
            row++;
            star++;
            space-=2;
            
        }
    }
}

    

