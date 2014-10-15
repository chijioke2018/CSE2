//Chijioke Umezinwa
//Roulette Program
//This program uses use a random number generator to simulate this person’s betting on 100 spins
//but runs the simulation 1000 times and collect data on the outcome.

public class Roulette{//declares class
    public static void main(String []arg){//declares main method
        int numSpins = 100;
        int profit = 0;
        int money = 0;
        int numLosses= 0;
        int countNum=1;
        int counter = 1;
        int numTimes = 0;
        int randNum =(int)( Math.random() * (37) + 0 );
        int newSpinNum;
        int money02=0;
        while(counter <= 1000){
            money=0;
            
            countNum = 0;
            while(countNum <= numSpins){
                
                newSpinNum = (int)( Math.random() * (37) +0 );
               //System.out.println( newSpinNum + " "+randNum);
                if( newSpinNum == randNum){
                    numTimes++;
                    money+=(36);
                    
                    //System.out.println("The number of spins were " + numTimes + " and the amount of money earned was " + money);
                }
                else{
                    numLosses++;
                    
                    
                }
                //System.out.println("The number of losses were" + numLosses);
                countNum++;
            }
            //System.out.println("The number of spins were " + numTimes + " and the amount of money earned was " + money);
            money02 += money;
            if(money> 100){
                profit++;
            }
            System.out.println( newSpinNum + " "+randNum);
            counter++;
        }
        System.out.println( newSpinNum + " "+randNum);
        System.out.println("The amount of times that a profit is earned is " + profit);
        System.out.println("The number of losses were" + numLosses);
        System.out.println("The number of spins when the number was called was " + numTimes + " and the amount of money earned was " + money02);
    }//end of main method
}//end of class