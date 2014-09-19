////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Chijioke Umezinwa
//[CSE002-110]
//Professor Brian Chen
//The purpose of this lab is to use a Scanner class to obtain from users how many Big Macs they want and 
//whether they want an order of fries.

import java.util.Scanner;
//define a class
public class BigMacAgain{
    //define a method
    public static void main( String [] args){
        Scanner myScanner;//declares a scanner object
        myScanner = new Scanner(System.in);//instantiates the new scanner object
        double bmTotal$;//variable of price of big macs purchased
        System.out.print("Enter the number of BigMacs:");//prompts user input
        
        if(myScanner.hasNextInt()){
            int numBM = myScanner.nextInt();//input of user

           if(numBM <0){//user cannot enter a negative number 
           
            System.out.println("You did not enter an positive number");
            return;
           }
        
            double eachBM$ = 2.22;//price of each big mac
            bmTotal$ = numBM * eachBM$;//total price of big macs purchased
            System.out.println("You ordered"+ numBM +" for a cost of " + numBM +"x"+ eachBM$ + " = "+ bmTotal$);
        
        }
        else{
            System.out.println("You did not enter an int");
            return;//leaves program, i.e.
                            //the program terminates
        }
        
        double ff$ =2.15;//price of french fries
        System.out.print("Do you want an order of fries (Y/y/N/n)?");//encourages user input
        String user;//input of user
        user=myScanner.next();
        
        //if user enters yes
        if(((user.equals("y"))||(user.equals("Y")))){
            System.out.println("You ordered fries at a cost of $" + ff$);
        }
       //if user enter no            
       else{
           ff$=0;
       }
        double totalCost$ = ff$ + bmTotal$;//calculates cost of meal
        System.out.println("The total cost of the meal is " + totalCost$);
    }//end main method
}//end class



