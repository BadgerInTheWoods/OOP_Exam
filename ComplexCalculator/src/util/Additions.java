package util;

import Model.ComplexNumber;

import java.util.Scanner;

public class Additions {

    public ComplexNumber createComplexNumber() {
        ComplexNumber a1 = new ComplexNumber(
                promptDouble("insert real part of the first number "),
                promptDouble("insert imaginary part of the first number "));
        return a1;
    }

    public void reset(ComplexNumber a1,ComplexNumber a2){
        a1 = null;
        a2 = null;
    }

    public void showCommands() {
        System.out.println("The commands are :");
        for (Commands c : Commands.values()) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
    public String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    public double promptDouble(String message) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.print(message);
            try {
                return scan.nextDouble();
            } catch (Exception e) {
                System.out.println("Try again");
            }
        }
    }
}
