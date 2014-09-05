//This program is meant to measure time elapsed in seconds
//and number of rotations of the front wheel
//
public class Cyclometer{
    //main method required ofr every Java program  
    public static void main( String args[]){
        //the input data
        int secsTrip1=480;  //Describes number of seconds for Trip1
        int secsTrip2=3220;  //Describes number of seconds for Trip2
        int countsTrip1=1561;  //number of counts during Trip1
        int countsTrip2=9037;  //number of counts during Trip2
        
        //our intermediate variables & output data
        double wheelDiameter=27.0,  //diameter of wheel
        PI=3.14159,  //
        feetPerMile=5280,  //amount of feet per mile
        inchesPerFoot=12,  //amount of inches per foot
        secondsPerMinute=60;  //amount of seconds per minute
        double distanceTrip1, distanceTrip2;
        double totalDistance;//
        
        System.out.println("Trip 1 took "+
        (secsTrip1/secondsPerMinute)+" minutes and had " +
        countsTrip1+" counts. ");
        System.out.println("Trip 2 took " + 
        (secsTrip2/secondsPerMinute) + " minutes and had " +
        countsTrip2 +"counts.");
        
        //run calculations; store the values. Document your
        //calculations here. What are you calculating?
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        //Above gives distance in inches
        //(for each count, a rotation of the wheel travels
        //the diameter in inches times PI)
        distanceTrip1/=inchesPerFoot*feetPerMile; //Gives 
        //distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot
        /feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        
        //print out the output data.
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
    }//end of main method 
}//end of class