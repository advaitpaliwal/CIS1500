import java.util.Scanner;
public class User_Information {
    public static void main(String[] args){
        String Name;
        int Age;
        double Income;

        Name = "";
        Age = 0;
        Income =0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your age: ");
        Age = keyboard.nextInt();

        System.out.println("Enter your income: ");
        Income = keyboard.nextDouble();

        System.out.println("Enter your name: ");
        Name = keyboard.next();

        System.out.println("Hello, " + Name + ". Your age is " + Age + " and your income is $" + Income);

    }
}
