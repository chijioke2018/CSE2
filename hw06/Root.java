//Chijioke Umezinwa
//Root Program
//This program is designed to use the bisection method used to compute the square root of a number
import java.util.Scanner;
public class Root{
    public static void main(String []arg){
        
        Scanner myScanner;//creates new Scanner object
        myScanner = new Scanner(System.in);//instantiates this scanner object
        
        System.out.print("Enter a number:");
        int low = 0;
        int x;
        int high = 1 + x;
        
        x = myScanner.nextInt();
        double middle = (high+low)/2;
        when((high-low)> (0.0000001 * high)){
           if(middle> x){
            high = middle;
            }
            else{
                low = middle;
            } 
        }
       
    }
}