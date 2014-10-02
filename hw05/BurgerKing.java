////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Chijioke Umezinwa
//Homework05
//Burger King Program
//Program prompts user to enter a choice of a burger, a soda, or fries. Then, program prompts user for more detail on
//their orders

import java.util.Scanner;

//enter class
public class BurgerKing{
    //enter main method
    public static void main( String [] args){
        Scanner myScanner;//creates new Scanner object
        myScanner = new Scanner(System.in);//instantiates this scanner object
        
        System.out.print("Enter a letter to indicate a choice of \n" +"Burger (B or b)\n" + "Soda (S or s)\n"+ "Fries(F or f)");
        String uInput;
        
        if(myScanner.hasNext()){
            uInput = myScanner.next();
            
            if(uInput.length()==1){
                switch(uInput){
                    case("B"):
                        System.out.print("Enter A or a for all the fixins\n"+"C or c for the cheese\n"+"N or n for none of the above");
                        String input01=myScanner.next();
                        switch(input01){
                            case("A"):
                                System.out.println("You ordered a burger with all the fixins");
                                break;
                            case("a"):
                                System.out.println("You ordered a burger with all the fixins");
                                break;
                            case("C"):
                                System.out.println("You ordered a burger with cheese");
                                break;
                            case("c"):
                                System.out.println("You ordered a burger with cheese");
                                break;
                            case("N"):
                                System.out.println("You ordered a burger with nothing");
                                break;
                            case("n"):  
                                System.out.println("You ordered a burger with nothing");
                                break;
                        }
                        break;
                    case("b"):
                        System.out.print("Enter A or a for all the fixins\n"+"C or c for the cheese\n"+"N or n for none of the above");
                        String input02=myScanner.next();
                        switch(input02){
                            case("A"):
                                System.out.println("You ordered a burger with all the fixins");
                                break;
                            case("a"):
                                System.out.println("You ordered a burger with all the fixins");
                                break;
                            case("C"):
                                System.out.println("You ordered a burger with cheese");
                                break;
                            case("c"):
                                System.out.println("You ordered a burger with cheese");
                                break;
                            case("N"):
                                System.out.println("You ordered a burger with nothing");
                                break;
                            case("n"):  
                                System.out.println("You ordered a burger with nothing");
                                break;
                        }
                        break;
                    case("S"):
                        System.out.print("Enter P or p for Pepsi"+"Coke(c or C)"+"Sprite(s or S)" + "Mountain Dew( m or M)");
                        String input03=myScanner.next();
                        switch(input03){
                            case("P"):
                                System.out.println("You ordered a Pepsi");
                                break;
                            case("p"):
                                System.out.println("You ordered a Pepsi");
                                break;
                            case("C"):
                                System.out.println("You ordered a Coke");
                                break;
                            case("c"):
                                System.out.println("You ordered a Coke");
                                break;
                            case("S"):
                                System.out.println("You ordered a Sprite");
                                break;
                            case("s"):  
                                System.out.println("You ordered a Sprite");
                                break;
                            case("m"):
                                System.out.println("You ordered a Mountain Dew");
                                break;
                            case("M"):
                                System.out.println("You ordered a Mountain Dew");
                                break;
                        }
                        break;
                    case("s"):
                        System.out.print("Enter P or p for Pepsi"+"Coke(c or C)"+"Sprite(s or S)" + "Mountain Dew( m or M)");
                        String input04=myScanner.next();
                        switch(input04){
                            case("P"):
                                System.out.println("You ordered a Pepsi");
                                break;
                            case("p"):
                                System.out.println("You ordered a Pepsi");
                                break;
                            case("C"):
                                System.out.println("You ordered a Coke");
                                break;
                            case("c"):
                                System.out.println("You ordered a Coke");
                                break;
                            case("S"):
                                System.out.println("You ordered a Sprite");
                                break;
                            case("s"):  
                                System.out.println("You ordered a Sprite");
                                break;
                            case("m"):
                                System.out.println("You ordered a Mountain Dew");
                                break;
                            case("M"):
                                System.out.println("You ordered a Mountain Dew");
                                break;
                        }        
                        break;    
                    case("F"):
                        System.out.print("Do you want a large or small order of fries (l,L,s, or S)");
                        String input05=myScanner.next();
                        
                        switch(input05){
                            case("l"):
                                System.out.println("You ordered large fries");
                                break;
                            case("L"):
                                System.out.println("You ordered large fries");
                                break;
                            case("s"):
                                System.out.println("You ordered small fries");
                                break;
                            case("S"):
                                System.out.println("You ordered small fries");
                                break;
                        }
                        break;    
                    case("f"): 
                        System.out.print("Do you want a large or small order of fries (l,L,s, or S)");
                        String input06=myScanner.next();
                        
                        switch(input06){
                            case("l"):
                                System.out.println("You ordered large fries");
                                break;
                            case("L"):
                                System.out.println("You ordered large fries");
                                break;
                            case("s"):
                                System.out.println("You ordered small fries");
                                break;
                            case("S"):
                                System.out.println("You ordered small fries");
                                break;
                        //break;
                        }
                }
                
                
            }
            else{
                System.out.println("A single character is expected.");
                return;
            }
        }
        
        else{
            System.out.println("Try again and please enter a B, b, S, s, F, f");
            return;
        }
    }
}