/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Chijioke Umezinwa
//Homework04
//Month Program
//Program has user enter a positive integer giving the number of seconds that have passed during the day and then
//displays the time in conventional form

import java.util.Scanner;

//Create class
public class TimePadding{
    //Create main method
    public static void main( String [] args ){
        int numSeconds;//number of seconds
        
        int numMin;
        
        int hours;
        Scanner myScanner;//creates new Scanner object
        myScanner = new Scanner(System.in);//instantiates this scanner object
        
        System.out.print("Enter the time in seconds: ");
        //numSeconds= myScanner.nextInt();
        
        if(myScanner.hasNextInt()){//scans to see if input is an int
            numSeconds= myScanner.nextInt();
            if( numSeconds<0 ){
                System.out.println("You did not enter an positive number");//Prints statement to remind user to not use negative number
                return;
            }
            
            hours = numSeconds/3600;
            //numMin = numSeconds/60;
            
            
            
            //System.out.println(numMin);
            
            
        }
        
        else{
            System.out.println("You did not enter an int");
            return;//leaves the program
        }
        
        
        
        
    }    
}