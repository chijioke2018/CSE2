//This class is used to calculate total amount of purchases made at Walmart, including sales tax

public class Arithmetic{
    public static void main (String args[]) {
        //Number of pairs of socks
        int nSocks=3;
        //Cost per pair of socks
        double sockCost$=2.58;

        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;

        //Number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
       
       //Pennsylvania State tax
        double taxPercent=0.06;
        
        double socksPrice = nSocks*sockCost$;//price of total socks purchased
        double glassesPrice = nGlasses*glassCost$;//price of total glasses purchased
        double envelopePrice= nEnvelopes*envelopeCost$;//price of total envelopes purchased
        
        double priceBefore = (socksPrice + glassesPrice + envelopePrice);//addition of price before tax
        
        double taxAdded = taxPercent * priceBefore;//amount of tax added 
        
        double totalPrice = priceBefore + taxAdded;//price after tax has been added
        
        //prints total price of each item and their sales tax
        System.out.println("The total price for socks is " + socksPrice +" and the total sales tax for that total cost is "+
        (socksPrice*taxPercent) );
        System.out.println("The total price for drinking glasses is " + glassesPrice + " and the total sales tax for that total cost is "
        + (glassesPrice*taxPercent) );
        System.out.println("The total price for envelopes is " + envelopePrice + " and the total sales tax for that total cost is "
        + (envelopePrice*taxPercent));
        
        System.out.println("The total cost of all the purchases before tax is added is " + priceBefore);//prints total cost before tax is added
        
        System.out.println("Total actually paid for this transaction including tax is " + totalPrice);//prints total cost after tax is added

    }//end main method
}//end class Arithmetic