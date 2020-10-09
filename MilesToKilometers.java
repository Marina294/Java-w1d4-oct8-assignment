import java.util.Scanner;

// (Conversion from miles to kilometers)
// Write a program that displays the following table 
// (note that 1 mile is 1.609 kilometers)

public class MilesToKilometers {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter miles: ");

        double Miles = input.nextDouble();
        // System.out.println(Miles + "Miles = " + MToK(Miles) + " km");
        
        double Km = Miles * 1.609;
        
        System.out.println(Miles + " miles = " + Km + " kilometers");



        // System.out.print("Enter kilometers: ");
        // double km = input.nextDouble();
        // System.out.println(km + "km = " + KTM(km) + " miles");
        // private static double MToK(double Miles) {
        //     return Miles * 1.609;
        // }
        

    
    }
}