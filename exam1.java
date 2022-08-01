//Advait Paliwal

import java.util.*;

public class exam1 {
    public static void main (String[] args) {
        double feet;
        double metres;

        System.out.print("Enter a length in feet: ");
        Scanner keyboard = new Scanner(System.in);
        feet = keyboard.nextDouble();

        metres = feet/3;

        System.out.print("Solution: " + metres + " metres");

    }
}
