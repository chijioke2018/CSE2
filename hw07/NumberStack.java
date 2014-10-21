//Chijioke Umezinwa
//How Do You Stack Up Program  
//Program forces user to enter an integer between 1 and 9, inclusive, and then prints out displays that depend on the value entered

import java.util.Scanner;

public class NumberStack{//class
    public static void main(String [] args){//main method
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        
        int uInput;
        
        System.out.print("Please enter an int between 1 - 9: ");
        
        
        if(myScanner.hasNextInt()){
            uInput = myScanner.nextInt();
            
            if( uInput<9 && uInput >1){
                //System.out.print("  ");
/* use of the for loops              
                for(int i = 1; i<=uInput;i++){//Organizes the number of groups printed
                    //System.out.print("   ");
                    for(int j = 0; j<i;j++){//number of lines in each group
                        //System.out.print("    ");
                        for(int x=0; x<(8-i); x++){//prints spaces
                            System.out.print(" ");    
                        }
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
                
                
*/ //end of for loops

/* use of while loops
                int i = 1;
                while (i<=uInput){
                    int j =0;
                    while( j < i ){
                        int x=0;
                        while(x<(8-i)){
                            System.out.print(" ");
                            x++;
                        }
                        int k = 0;
                        while(k<((2*i)-1)){
                            System.out.print(i);
                            k++;
                        }
                        System.out.println("");
                        j++;
                    }
                    int x = 0;
                    while(x<(8-i)){
                        System.out.print(" ");  
                        x++;
                    }
                    int k = 0; 
                    while( k< ((2*i)-1) ){
                        System.out.print("-");
                        k++;
                    }
                    System.out.println("");
                    i++;
                }
*/ //end of while loops          
                int i = 1;
                do{
                    int j = 0;
                    do{
                       int x = 0;
                       do{
                           System.out.print(" ");
                           x++;
                       }
                            while(x<(8-i));
                       int k = 0;    
                       do{
                           System.out.print(i);
                           k++;
                       }   
                            while(k<((2*i)-1));
                       System.out.println("");
                       j++; 
                       
                    }
                        while(j<i);
                    int x = 0;
                    do{
                        System.out.print(" ");  
                        x++;
                    }
                        while(x<(8-i));
                        
                    int k = 0;
                    do{
                        System.out.print("-");
                        k++;
                    }
                        while(k< ((2*i)-1) );
                    System.out.println("");    
                    i++;
                }
                    while(i<uInput);
                    
            }

            else{
                System.out.println("Please enter int between 1 & 9");
            }
            
        }
        
        else{
            System.out.println("Please enter an int");
        }

        
    }
}
  