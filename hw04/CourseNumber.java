/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Chijioke Umezinwa
//Homework04
//Course Number Program
//Programs reads a six digit number, making sure that the first four digits give the year, and the last two digits give the
//semester

import java.util.Scanner;

//enter class
public class CourseNumber{
    //enter main method
    public static void main( String [] args){
        Scanner myScanner;//creates new Scanner object
        myScanner = new Scanner(System.in);//instantiates this scanner object
    
        int sixNum;
        int year = 0;
        
        int semester =0;
        System.out.print("Enter a six digit number giving the course semester:");
        
        if(myScanner.hasNextInt()){
          sixNum = myScanner.nextInt();
          int replaceSix = sixNum;
          int count =0;
          while( count <7){
            replaceSix /=10;
            count++;
          }//end of while loop
          
          if( count < 6){
            System.out.println(sixNum + " is not a legitmate number");
            return;
          }
          
          if( sixNum < 186510 || sixNum > 201440){
              System.out.println("The number was outside the range [186510,201440]");
              return;
          }
          
          else{
              year = sixNum/100;
              semester = sixNum%100;
          }
          
          System.out.println("The course was offered in the " + semester + " semester of " + year);
          
        } 
        
        
        else{
            System.out.println("This is not a legitmate number");
            return;//leaves the program
        }
        
    }
}
