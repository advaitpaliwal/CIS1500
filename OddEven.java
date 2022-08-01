import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        int num;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter an integer.");
        num = keyboard.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }
}