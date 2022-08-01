import javax.swing.JOptionPane;

public class User_Name {
    public static void main(String[] args) {
        String First_Name;
        String Last_Name;

        First_Name = "";
        Last_Name = "";

        First_Name = JOptionPane.showInputDialog("What is your first name? ");
        Last_Name = JOptionPane.showInputDialog("What is your last name? ");

        JOptionPane.showMessageDialog(null, "Hello " + First_Name + " " + Last_Name);

        System.exit(0);
    }
}