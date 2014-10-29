//Chijioke Umezinwa
//Driver Program
//This program gives practice in writing methods, overloading methods, and in forcing the user to enter good input

import java.util.Scanner;//declares import statement
public class HW8{//declares class
	  public static void main(String []arg){//main method
			char input;//declares variable of type char
			Scanner scan=new Scanner(System.in);//declares and instantiates scanner object
			System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");//This is a print statement
			input=getInput(scan,"Cc");//calls getInput and makes it equal to input
			System.out.println("You entered '"+input+"'");//print statement
			System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");//this is user input
			input=getInput(scan,"yYnN",5); //give up after 5 attempts
			if(input!=' '){//if input does not equal blank space
		   	System.out.println("You entered '"+input+"'");//print statement
			}
			input=getInput(scan,"Choose a digit.","0123456789");//calls getInput method
			System.out.println("You entered '"+input+"'");//print statement
		}
		
		public static char getInput( Scanner a, String b){
				
				String uInput = a.next();
				int c = 0;
				
				while(c < uInput.length() ){
					if (uInput.length() == 1){//uInput is only one character )
						char input = uInput.charAt(0);
						
						if( input == 'c' || input =='C' ){
							return input;
						}
					
					}
					c++;
			    }
				
				return ' ';
		}
	 
	 	public static char getInput( Scanner b, String c, int a){
	 			int ab =0;
	 			a = 0;
	 			String gh = b.next();
	 			while( ab < gh.length()){
		 			while(a<5){
		 				
		 				char Input = c.charAt(0);
		 				if( Input == 'y' || Input == 'Y' || Input == 'n' || Input == 'N' ){
		 					return Input;
		 				}
		 				a++;
		 			}
		 			ab++;
	 			}
	 			
	 			String inCorrect = "Enter again";
				char inCorrect01 = inCorrect.charAt(11 );
				return inCorrect01;
	 	}
	 	
	 	public static char getInput( Scanner c, String d, String multNUm   ){
	 		char uInput01 = ' ';
	 		int jf =0;
	 		System.out.println( "Enter one of:"); 
	 		while( jf < multNUm.length()){	
		 		for(int i = 0; i<multNUm.length(); i++){
		 			uInput01 += multNUm.charAt(i);
		 		}
		 		
		 		jf++;
		 		return uInput01;
		 		
	 		}
	 		return ' ';
	 	}
}