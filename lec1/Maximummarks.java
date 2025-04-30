package lec1;

public class Maximummarks {
    public static void main(String[] args) {
        int m=54;
        if(m>=75){
            System.out.println("A grade");
        }
        else if(m>=65){
            System.out.println("B grade");
        }
        else if (m>=55 && m<65){
            System.out.println("C grade"); 
        }
        else if(m>=45 && m<55){
            System.out.println("Pass");
        }
        else{
            System.out.println("fail");
        }
        
    }
    
}

    

