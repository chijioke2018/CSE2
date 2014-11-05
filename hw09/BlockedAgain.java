//Chijioke Umezinwa
//Blocked Again Program
//This program allows the user to create a modular program and substitute the module without having to worry about the correctness
//of your code

import java.util.Scanner;
public class BlockedAgain{
    public static void main(String []s){
        int m;
        //force user to enter int in range 1-9, inclusive.
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        m = getInt(); 
        allBlocks(m);
    }
    
    public static int getInt(){
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        int uInput01 = myScanner.nextInt();
        if(checkInt(uInput01)){
          if((checkRange(uInput01)) = 5 ){
            return uInput01;
          }
        }
    }
    
    public static boolean checkInt(int a){
         //int uInput02 = myScanner.nextInt();
         if(a.hasNextInt()){
             return true;
         }
         return false;
    }
     
    public static int checkRange(int b){
        int returnNum = 0;
        if(b>=0 && b<=9){
            returnNum = 5;
        }
        return returnNum;
        
    }
    
    public static void allBlocks(int x){
        block();
        
    }
    
    public static void block(){
       for(int i = 1; i<=x;i++){//Organizes the number of groups printed
                    //System.out.print("   ");
                    for(int j = 0; j<x;j++){//number of lines in each group
                        //System.out.print("    ");
                        line();
                        for(int k = 0; k < ((2*i)-1); k++){//prints numbers from 1-uInput
                            System.out.print(i);
                            //System.out.println("");
                            
                        }
                        System.out.println("");
                    }
                    for(int x=0; x<(8-i); x++){
                        System.out.print(" ");    
                    }
                    for(int k = 0; k < ((2*i)-1); k++){
                            System.out.print("-");
                            //System.out.println("");
                    }
                    System.out.println("");
                    
                    //System.out.print(" ");
                }   
        
    }
    
    public static void line(){
        for(int x=0; x<(8-i); x++){//prints spaces
                            System.out.print(" ");    
        }
    }
    
    
}