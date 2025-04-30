package lec1;

public class Lottery_game {
    public static void main(String[] args) {
        int L=10;
        if(L>=15 && L<=20 ){
            System.out.println("Bike");
        }
        else if(L>=50 && L<=80){
            System.out.println("Cycle");
        }
        else if (L>=100 && L<=200){
            System.out.println("Car"); 
        }
        else if(L>=250 && L<=300){
            System.out.println("mac book");
        }
        else if(L>=1200 && L<=1400){
            System.out.println("book");
        }
        else{
            System.out.println("Happy Birthday");
        }
        
    }
    
}
    
    

