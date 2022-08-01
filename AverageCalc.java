import java.util.*;

public class AverageCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num_1 = scan.nextDouble();
        System.out.print("Enter second number: ");
        double num_2 = scan.nextDouble();
        System.out.print("Enter first number: ");
        double num_3 = scan.nextDouble();
        List < Double > array = new ArrayList < > ();
        double total = 0;
        array.add(num_1);
        array.add(num_2);
        array.add(num_3);
        for (Double aDouble: array) {
            total = total + aDouble;

        }
        double avg = total / array.size();
        System.out.println(avg);

    }
}