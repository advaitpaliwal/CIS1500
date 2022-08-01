package Project3;

import javax.swing.*;

public class Pet {
    private String name;
    private String animal;
    private double age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Pet pet1 = new Pet();

        String name = JOptionPane.showInputDialog("Enter your pet’s name");
        String animal = JOptionPane.showInputDialog("Enter your pet’s type");
        String Temp = JOptionPane.showInputDialog("Enter your pet’s age");
        double age = Double.parseDouble(Temp);

        pet1.setName(name);
        pet1.setAnimal(animal);
        pet1.setAge(age);

        JOptionPane.showMessageDialog(null, "The pet's name is " + pet1.getName());
        JOptionPane.showMessageDialog(null, "The pet's type is " + pet1.getAnimal());
        JOptionPane.showMessageDialog(null, "The pet's age is " + pet1.getAge());

    }
}