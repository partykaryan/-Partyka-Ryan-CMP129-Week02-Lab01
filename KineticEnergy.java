import java.util.Scanner;

public class KineticEnergy {

    public static void main(String []args){

    Scanner keyboard = new Scanner(System.in);

    //Variable Declaration
    double mass;
    double velocity; 
    double energy;

    System.out.print("Enter the mass ==> ");
    mass = keyboard.nextDouble();

    System.out.print("Enter the velocity ==>");
    velocity = keyboard.nextDouble();

    energy = kineticEnergy(mass, velocity);

    System.out.println("The Kinetic Energy of an Object of mass " + mass + " kilograms" +
    "\nand Velocity of " + velocity + " meters per second is " + energy);

keyboard.close();
}//end of main method

//return method for calculating kinetic energy
public static double kineticEnergy (double mass, double velocity)
{
    return 0.5 * mass * Math.pow(velocity, 2);
}

}//end of public class
