/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Chijioke Umezinwa
//Homework04
//Income Tax Program
//Prompts User to enter int that gives the thousands of dollars of income and then writes out the 
//amount of taxes on the income

import java.util.Scanner;

//Create class
public class IncomeTax{
    //create main method
    public static void main( String []args){
        Scanner myScanner;//creates new Scanner object
        myScanner = new Scanner(System.in);//instantiates this scanner object
        
        int tax = 1;
        
        double taxOwed;
        System.out.print("Enter an int giving the number of thousands:");//user input
        //int numGiven = myScanner.nextInt();
        int numGiven;
        if(myScanner.hasNextInt()){
            numGiven = myScanner.nextInt();//input of user
            
            if( numGiven < 0){//user cannot enter a negative number 
           
            System.out.println("You did not enter an positive number");//Prints statement to remind user to not use negative number
            return;
            }
            
            if(numGiven<20){// if user enters int less than 20
                tax = 5;
            }
            
            if(numGiven >= 20   && numGiven < 40){//if user enters int greater or equal to 20 or is less than 40
                tax = 7;
            }
            
            if(numGiven>= 40  && numGiven < 78){//if user enters int greater or equal to 40 or is less than 78
                tax = 12;
            }
            
            if( numGiven > 78 ){//if user enters int greater than 78
                tax = 14;
            }
            
            
            //System.out.println(tax);
            taxOwed = numGiven*10.0*tax;//takes out the amount of dollars owed
            
        }
        
        else{
            System.out.println("You did not enter an int");
            return;//leaves the program
        }
        
        System.out.println("The tax rate on " + numGiven + " is " + tax + ", and the tax is " + taxOwed );//prints out the int given by user, the tax rate, and the amount of tax owed
        
    }
}