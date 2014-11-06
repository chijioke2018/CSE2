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
        //int uInput01 = myScanner.nextInt();
        while(true){
            if(checkInt(myScanner)){
                int test = checkRange(myScanner);
              if(test<0){
                    System.out.print("Try another number");
                    continue;//go back to the while loop
              }
              else{
                  return test;
              }
            }
        }
    }
    
    public static boolean checkInt( Scanner myScanner){
         //int uInput02 = myScanner.nextInt();
         //myScanner = myScanner.nextInt();
         if(myScanner.hasNextInt()){
             return true;
         }
         return false;
    }
     
    public static int checkRange(Scanner myScanner){
        int nextNum = myScanner.nextInt();
        int returnNum = -1;
        if(nextNum>=0 && nextNum<=9){
            return nextNum;
        }
        
        return returnNum;
        
    }
    
    public static void allBlocks(int x){//makes all of the blocks loops for blockk of szie 1, size 2 etc
        //int counter01=0;
        for(int i=0; i<=x;i++){
            block(i);
            //counter01 = i;
        }
        
    }
    
    public static void block(int a){//makes one block
        
        for(int j = 0; j<a;j++){//number of lines in each group
            line(j);
        }               
    }
    
    public static void line(int y){//makes one line
        for(int x=0; x<(8-y); x++){//prints spaces
                System.out.print(" ");    
        }
    }
    
    
}