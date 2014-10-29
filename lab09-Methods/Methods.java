//Chijioke Umezinwa
//Methods Program   
//This program allows user to practice writing methods

import java.util.Scanner;
public class Methods{
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    int a,b,c;
    System.out.println("Enter three ints");
    a=getInt(scan);
    b=getInt(scan);
    c=getInt(scan);
    System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
    System.out.println("The larger of "+a+", "+b+", and "+c+
                       " is "+larger(a,larger(b,c)));
    System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+
                       ", and "+c+" are in ascending order");
  }
  
  public static int getInt(Scanner b){
      int num=0;
      System.out.print("Enter an int ");
      while(!b.hasNextInt()){
        System.out.print("You did not enter an int");
        //num = b.nextInt();
        b.next();
      }
      num = b.nextInt();
      return num;
  }
  
  public static int larger(int num01, int num02){
      int larger=0;
      if( num01 > num02){
          larger=num01;
      }
      else if(num02>num01){
          larger=num02;
      }
      return larger;
  }
  
  public static boolean ascending( int num01, int num02, int num03){
      boolean value=false;
      if(num01<num02){
          if(num02<num03){
            if(num01<num03){
                value = true;
            }
          }
      }
      return value;
    
  }
/*******SAMPLE RUNS:
Enter three ints
Enter an int- r
You did not enter an int; try again- 3
Enter an int- 8
Enter an int- 9
The larger of 3 and 8 is 8
The larger of 3, 8, and 9 is 9
It is true that 3, 8, and 9 are in ascending order

Enter three ints
Enter an int- 4
Enter an int- 3
Enter an int- 7
The larger of 4 and 3 is 4
The larger of 4, 3, and 7 is 7
It is false that 4, 3, and 7 are in ascending order
*/
}