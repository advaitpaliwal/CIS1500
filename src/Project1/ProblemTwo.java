package Project1;

import java.util.*;

public class ProblemTwo {
    public static void main(String[] args){

        //Project name, title, topic
        System.out.println("Advait Paliwal");

        System.out.println("Project_1 Problem_2\n");

        System.out.println("This program computes the average of student’s\nthree test scores\n");

        //Step 1: Declare variables
        double Ave_Score;
        double Score_1;
        double Score_2;
        double Score_3;

        //Step 2: Define Variables
        Ave_Score = 0;
        Score_1 = 0;
        Score_2 = 0;
        Score_3 = 0;

        //Step 3: Get inputs

        //Create Scanner objects to read input
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the student’s first test score");
        Score_1 = scan.nextDouble();

        System.out.println("Enter the student’s second test score");
        Score_2 = scan.nextDouble();

        System.out.println("Enter the student’s third test score");
        Score_3 = scan.nextDouble();

        //Step 4: Perform Calculations
        Ave_Score = (Score_1 + Score_2 + Score_3) / 3;

        //Step 5: Display output
        System.out.println("\nYour test scores are:");

        System.out.println("\tTest 1 = " + Score_1);
        System.out.println("\tTest 2 = " + Score_2);
        System.out.println("\tTest 3 = " + Score_3);

        System.out.println("\nAverage test score is " + Ave_Score);
    }
}
