//Chijioke Umezinwa
//Loop The Loop Program
//This program utilizes while loops to print out stars

import java.util.Scanner;//imports user

public class LoopTheLoop{//defines class
    public static void main( String [] arg){//brings in the main method
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        System.out.print("Enter an int between 1-15-");
        
        int num;
        if(myScanner.hasNextInt()){
            
            
            num = myScanner.nextInt();
            if(num <15 && num >1){
                
                
            }
            else{
                System.out.print("please enter a number between 1 & 15");
            }
        }
        else{
            System.out.print("Please enter an int");
        }
        
        
        
        int nStars = 10;//instantiates nStars as int variable
        int countStars = nStars+10;//instantiates countStars as int
        while(nStars< countStars){//while loop
            System.out.print("*");//prints out *
            nStars++;//increments nStars
        }
        System.out.println("");
        
        
        nStars=1;
        int countStars01=10;
        while(nStars <= countStars01){
            int counter=1;
            
            
            while(counter <= nStars){
                System.out.print("*");
                counter++;
               
            }
            
            nStars++;
            System.out.println("");

        }
    }
}