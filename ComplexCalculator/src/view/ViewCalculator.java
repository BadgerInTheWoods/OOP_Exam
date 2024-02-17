package view;

import Controller.impl.Calculator;

import java.util.Scanner;
import util.Commands;
import Model.ComplexNumber;

public class ViewCalculator {

    private final Calculator calculator;

    public ViewCalculator(Calculator calculator) {
        this.calculator = calculator;
    }


    public void run() {
        ComplexNumber a1;
        ComplexNumber a2;
        Commands com;
        showCommands();
        while (true) {
            while (true) {
                String command = prompt("Введите команду: ");
                try {
                    com = Commands.valueOf(command);
                    break;
                } catch (Exception e) {
                    System.out.println("Error: wrong command " + command);
                }
            }
            if (com == Commands.EXIT) return;
            switch (com) {
                case ADD:
                    a1 = createComplexNumber();
                    a2 = createComplexNumber();
                    System.out.println(calculator.add(a1,a2));
                    reset(a1,a2);
                    break;
                case MULTIPLY:
                    a1 = createComplexNumber();
                    a2 = createComplexNumber();
                    System.out.println(calculator.multiply(a1,a2));
                    reset(a1,a2);
                    break;
                case SUBTRACT:
                    a1 = createComplexNumber();
                    a2 = createComplexNumber();
                    System.out.println(calculator.subtract(a1,a2));
                    reset(a1,a2);
                    break;
                case DIVIDE:
                    a1 = createComplexNumber();
                    a2 = createComplexNumber();
                    System.out.println(calculator.subtract(a1,a2));
                    reset(a1,a2);
                    break;

            }
        }
    }

    private ComplexNumber createComplexNumber() {
        ComplexNumber a1 = new ComplexNumber(
                promptDouble("insert real part of the first number "),
                promptDouble("insert imaginary part of the first number "));
        return a1;
    }

    private void reset(ComplexNumber a1,ComplexNumber a2){
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
