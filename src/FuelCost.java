import java.util.Scanner;

import static java.lang.System.in;

public class FuelCost {

    public static void main(String[] args) {
        int gallonsGas=0;
                double fuelEfficiency=0;
                        double gasPrice=0;
                        double totalPrice=0;
                        double currentMiles;
                        Scanner in = new Scanner(System.in);
        System.out.println("How many gallons is in your tank ?");
        if(in.hasNextInt()) {
            gallonsGas = in.nextInt();
        }
        else {
            System.out.println("Must enter a valid number");
        }
        System.out.println("What is your Mpg ?");
        if(in.hasNextDouble()) {
            fuelEfficiency = in.nextDouble();
        }
        else {
            System.out.println("Must enter a valid number");
        }
        System.out.println("What is the current gas price ?");
        if(in.hasNextDouble()) {
            gasPrice = in.nextDouble();
        }
        else
        {
            System.out.println("Must enter a valid number");
        }
        totalPrice = (100 / fuelEfficiency)*gasPrice;
        currentMiles = gallonsGas * fuelEfficiency;
        System.out.println(" With the gas in your vehicle you can travel "+currentMiles);
        System.out.println(" Your fuel cost for 100 miles is "+totalPrice);




    }
}
