////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Chijioke Umezinwa
//Homework05
//Program that has three boolean variables to each of which the value of true or false is randomly assigned. Then, at random,
//combine the three variables with random choices of && and || and stores the result.

import java.util.Scanner;
import java.util.Random;

//enter class
public class BoolaBoola{
    
    //enter main method
    public static void main(String [] args){
        Scanner myScanner;//creates new Scanner object
        myScanner = new Scanner(System.in);//instantiates this scanner object
        
        String symbol;
        
        RandomBoolean randomboolean = new RandomBoolean();
        x=Math.random*2;
        if(x==0){
            symbol="||";
        }
        else{
            symbol="&&";
        }
        Boolean num01,num02,num03;
        for(int i = 0 ; i<3;i++){
            num01=randomboolean;
            num02=randomboolean;
            num03=randomboolean;
        }
        System.out.print("Does" + num01 + symbol + num02 + symbol + num03 + "Have the true value or false value?" );
        String uInput;
        
        
    }
}