//Chijioke Umezinwa
//Homework 03
//FourDigits Java Program
//Program prompts user to enter a double and print out first four digits

import java.util.Scanner;

public class FourDigits{
    
    public static void main(String [] args){
        Scanner myScanner;//new Scanner object
        myScanner = new Scanner(System.in);//instantiates an object
        
        System.out.println("Enter a double and I display the four digits to the right of the decimal point" );
        
        double numDouble01 = myScanner.nextDouble();
        int numDouble02 = (int)numDouble01;
        numDouble02*=10000;
        
        double newNumber = (numDouble01*10000);
        
        
        
        
        
        System.out.println("The four digits are " +(-(numDouble02 - newNumber)) );
        
        
    }//end main method
    
}//end of class