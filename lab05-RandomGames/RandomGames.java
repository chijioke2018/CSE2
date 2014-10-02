/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Chijioke Umezinwa
//lab05
//Random Games Program
//This program is supposed to use the scanner class to obtain from user one of three choices for a game of chance

import java.util.Scanner;

//enter class
public class RandomGames{
    //enter main method
    public static void main(String [] args){
        Scanner myScanner;//Creates new scanner object
        myScanner=new Scanner(System.in);//instantiates this scanner object
        
        System.out.print("Enter R or r for Roulette, C or c for craps, P or p for pick a card: ");
        String uInput;
        
        //uInput = myScanner.next();
        
        if(myScanner.hasNext()){
            uInput = myScanner.next();
        
            if(uInput.length()==1){
                switch(uInput){
                    case("r"):
                       System.out.println("You have selected Roulette!");
                       int rouRandom =(int) (Math.random()*(36)+1);
                       System.out.println("Roulette:" + rouRandom);
                       break;
                    case("R"):
                        System.out.println("You have selected Roulette!");
                        int rouRandom01 = (int) (Math.random()*(36)+1);
                        System.out.println("Roulette:" + rouRandom01);
                        break;
                    case("C"):
                        System.out.println("You have selected Craps!");
                        int CrapsRoll01 = (int) (Math.random()*(6)+1);
                        int CrapsRoll02 = (int) (Math.random()*(6)+1);
                        
                        System.out.println("Craps:" + CrapsRoll01 + " and " + CrapsRoll02);
                        break;
                    case("c"):
                        System.out.println("You have selected Craps!");
                        int CrapsRoll001 = (int) (Math.random()*(6)+1);
                        int CrapsRoll002 = (int) (Math.random()*(6)+1);
                        
                        System.out.println("Craps:" + CrapsRoll001 + " and " + CrapsRoll002);
                        break;
                    case("p"):
                        System.out.println("You have selected pick a card!");
                        System.out.println("Picking a card is not implemented yet");
                        break;
                    case("P"):
                        System.out.println("You have selected pick a card!");
                        System.out.println("Picking a card is not implemented yet");
                        break;
                } 
            }
            else{
                System.out.println("A single character is expected.");
                return;
            }
        }
        
        else{
           System.out.println("Try again and please enter a r, R, C, c, P, p");
            return;
        }
        
    }
    
    
}
