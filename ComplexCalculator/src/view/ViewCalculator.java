package view;

import Controller.impl.Calculator;

import java.util.Scanner;

import util.Additions;
import util.Commands;
import Model.ComplexNumber;
import util.Additions;

public class ViewCalculator {

    private final Calculator calculator;

    public ViewCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    private final Additions additions = new Additions();


    public void run() {
        ComplexNumber a1;
        ComplexNumber a2;
        Commands com;
        additions.showCommands();
        while (true) {
            while (true) {
                String command = additions.prompt("Введите команду: ");
                try {
                    com = Commands.valueOf(command);
                    break;
                } catch (Exception e) {
                    System.out.println("Error: wrong command " + command);
                }
            }
            if (com == Commands.EXIT) return;
            a1 = additions.createComplexNumber();
            a2 = additions.createComplexNumber();
            switch (com) {
                case ADD:

                    System.out.println(calculator.add(a1,a2));
                    additions.reset(a1,a2);
                    break;
                case MULTIPLY:

                    System.out.println(calculator.multiply(a1,a2));
                    additions.reset(a1,a2);
                    break;
                case SUBTRACT:

                    System.out.println(calculator.subtract(a1,a2));
                    additions.reset(a1,a2);
                    break;
                case DIVIDE:

                    System.out.println(calculator.subtract(a1,a2));
                    additions.reset(a1,a2);
                    break;

            }
        }
    }


}
