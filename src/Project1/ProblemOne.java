package Project1;

import java.util.*;

public class ProblemOne {
    public static void main(String[] args){

        //Project name, title, topic
        System.out.println("Advait Paliwal");

        System.out.println("Project_1 Problem_1\n");

        System.out.println("This program computes the total amount of change\nwhen given the number of pennies, nickels, dimes, and\nquarters\n");

        //Step 1: Declare variables
        int P;
        int N;
        int D;
        int Q;
        double Total;

        //Step 2: Define Variables
        P = 0;
        N = 0;
        D = 0;
        Q = 0;
        Total = 0;

        //Step 3: Get inputs

        //Create Scanner objects to read input
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of pennies");
        P = scan.nextInt();

        System.out.println("Enter the number of nickels");
        N = scan.nextInt();

        System.out.println("Enter the number of dimes");
        D = scan.nextInt();

        System.out.println("Enter the number of quarters");
        Q = scan.nextInt();

        //Step 4: Perform Calculations
        Total = 0.01* P + 0.05*N + 0.1*D + 0.25*Q;

        //Step 5: Display output
        System.out.println("\nTotal is $" + Total);

    }
}
