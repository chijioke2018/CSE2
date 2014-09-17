//Chijioke Umezinwa
//Homework 03
//Bicycle Java Program
//Calculates the amount of time and number of minutes it takes for the trip

import java.util.Scanner;

//Create class
public class Bicycle{
    //create main method
    public static void main( String []args ){
        Scanner myScanner;//new Scanner Object
        myScanner = new Scanner(System.in);//instantiates the object
        
        System.out.print("Please enter number of counts on cyclometer: ");
        //user input
        int numCyclometer = myScanner.nextInt();
        
        System.out.print("Please enter number of seconds of trip:" );
        //user input
        int seconds = myScanner.nextInt();
        
        double wheelDiameter = 27.0,  
        feetPerMile=5280,
        inchesPerFoot=12,
        PI=3.14159,
        secondsPerMinute=60;
        double distanceTrip;
        
        
        distanceTrip= numCyclometer*wheelDiameter*PI;//caluclates distance of trip in inches
        distanceTrip/=inchesPerFoot*feetPerMile;//Gives distance in miles
        
        System.out.println("The trip took " + (seconds/secondsPerMinute) +" minutes and was"+ distanceTrip +"miles long.");
        
        double mph = distanceTrip/((seconds/secondsPerMinute)/60);
        
        System.out.println("The average miles per hour was " + mph);
    }//end main method
}//end class