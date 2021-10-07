import javax.swing.JOptionPane;

public class VolumeGUI {
    public static void main(String[] args){
        double radius;
        double volume;
        String Temp;
        Temp = JOptionPane.showInputDialog("Please input a radius of a circle.");
        radius = Double.parseDouble(Temp);
        volume = Math.PI * radius * radius * radius;
        JOptionPane.showMessageDialog(null, "The volume of the circle is " + volume);

    }
}
