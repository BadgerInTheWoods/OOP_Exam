
import Controller.impl.Calculator;

import view.ViewCalculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        ViewCalculator view = new ViewCalculator(calculator);
        view.run();
    }
}
