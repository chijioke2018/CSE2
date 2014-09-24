/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Chijioke Umezinwa
//Homework04
//Month Program
//Prompts user to enter integer for the month and then displays the number of days in the month

import java.util.Scanner;

//Create class
public class Month{
    public static void main( String [] args){
        
        int numMonth;//month
        
        int days=1;//instantiates variable days as 1
        Scanner myScanner;//creates new Scanner object
        myScanner = new Scanner(System.in);//instantiates this scanner object
        
        System.out.print("Enter an int giving the number of the month (1-12):");
        if(myScanner.hasNextInt()){//scans to see if input is an int
            numMonth = myScanner.nextInt();//instantiates numMonth as user input
            
            if(numMonth >12 || numMonth <1){//checks to see if numMonth is between 1 & 12
                System.out.println("You did not enter an int between 1 and 12");//prints out statement
                return;//ends program
            }
            
            //checks if user input matches conditions
            if (numMonth==1 || numMonth ==3 || numMonth == 5 || numMonth==7 || numMonth== 8 || numMonth == 10 || numMonth == 12){
                days = 31;//number of days for January, March, May, July, August, October, and December
            }
            
            //if user input is the month of february
            if(numMonth == 2 ){
                days =28;//days in the month of february
            }
            
            //if user input matches conditions
            if(numMonth==4 ||numMonth==6||numMonth==9||numMonth==11){
                days =30;//days in the month of April,  June, September, November
            }
        }
        
        else{
            System.out.println("You did not enter an int");
            return;//leaves the program
        }
        
        
        System.out.println("The month has " + days + " days.");//prints out the number of days in a month
       
    }
}