package WriteData;

import java.util.Scanner;
import java.io.*;

public class Write_Data {
    public static void main(String[] args) throws IOException {
        //Step 1 declare variables
        double Num_1;
        double Num_2;
        double Num_3;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter number 1");
        Num_1 = keyboard.nextDouble();

        System.out.println("Enter number 2");
        Num_2 = keyboard.nextDouble();

        System.out.println("Enter number 3");
        Num_3 = keyboard.nextDouble();
        PrintWriter outputFile = new PrintWriter("/Users/advaitpaliwal/IdeaProjects/OCC/src/WriteData/data.txt");
        outputFile.println(Num_1);
        outputFile.println(Num_2);
        outputFile.println(Num_3);
        outputFile.close();
        System.out.println("Success");

    }
}