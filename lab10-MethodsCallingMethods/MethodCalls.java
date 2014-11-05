//Chijioke Umezinwa
//Method Calls Program
//This program allows the user to practice writing methods

public class MethodCalls{
    public static void main(String []  arg){
        int a=784,b=22,c;
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
    }
    
    public static int addDigit( int num01, int num02){
        //String num001 = ""+num01;
        //String num002 = "" + num02;
        
        //String result = num002 + num001;
        
        //int resultFin = Integer.parseInt(result);
        //int length = num001.length();
        int sign=1;
        //if(num02.length()>1){
            //System.out.println("There is an error");
        //}
        //num02*length;
        if (num01<0){
           
           sign = -1;
           num01 = -(num01);
            
        }
        String num001 = ""+num01;
        String num002 = "" + num02;
        
        if(num002.length()>1){
            System.out.println("There is an error");
        }
        String result = num002 + num001;
        int resultFin = Integer.parseInt(result) * sign;
        return resultFin;
        
    }
    
    public static int join( int num01, int num02){
        int result;
        //int newOne = 0;
        //int sum = 0;
        //String resultLoop;
        //for( int i = 0; i< num02.length(); i++){
           // newOne= num02%10;
            //resultLoop += newOne;
        //}
        result = addDigit(num02, num01);
        return result;
    }
    
    
    
}  
/*
Add 3 to 784 to get 3784
Add 3, 4, and 5 to 784 to get 543784
Add 3 to -98 to get: -398
Join 784 to 22 to get 78422
Join 87, 42, and 83 to get 874283
Join -9 and -90 to get 990
*/
