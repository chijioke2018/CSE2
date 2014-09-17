//Chijioke Umezinwa
//Homework 03
//Root Java Program
//User enters double, the crude estimate of the cube root of the number is calculated as well
//as the value of this crude guess when cubed
//
import java.util.Scanner;
//Create Class
public class Root{
    
    //Create main method
    public static void main(String [] args){
        Scanner myScanner;//new scanner object
        myScanner = new Scanner(System.in);//instantiates an object
        
        System.out.print("Please enter a double: ");
        //User input
        double numDouble01 = myScanner.nextInt();
        
        double numDouble02 = (numDouble01)/3;//guesses the cube root of user input
        System.out.println("and I print its cube root" +numDouble02);//prints the cube root
        
        //method to try and improve guess of cube root
        double guess = (numDouble02*numDouble02*numDouble02+numDouble01)/(3*numDouble02*numDouble02);
        
        System.out.print("The cube root is" + guess);//prints improvisation of guess
        
    }//end of main method
}//end of main class