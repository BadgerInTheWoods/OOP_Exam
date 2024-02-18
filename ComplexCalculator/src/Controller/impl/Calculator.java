package Controller.impl;


import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import Controller.Calculable;
import Model.ComplexNumber;
public class Calculator implements Calculable {

    private static final Logger logger = Logger.getLogger(Calculator.class.getName());

    @Override
    public ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
        double realPart = num1.getRealPart() + num2.getRealPart();
        double imaginaryPart = num1.getImaginaryPart() + num2.getImaginaryPart();
        ComplexNumber result = new ComplexNumber(realPart, imaginaryPart);
        log(String.format("addition of %s and %s results in %s", num1, num2, result));
        return result;
    }

    @Override
    public ComplexNumber subtract(ComplexNumber num1, ComplexNumber num2) {
        double realPart = num1.getRealPart() - num2.getRealPart();
        double imaginaryPart = num1.getImaginaryPart() - num2.getImaginaryPart();
        ComplexNumber result  = new ComplexNumber(realPart, imaginaryPart);
        log(String.format("subtraction of %s and %s results in %s", num1, num2, result));
        return result;
    }

    @Override
    public ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
        double realPart = num1.getRealPart() * num2.getRealPart() - num1.getImaginaryPart() * num2.getImaginaryPart();
        double imaginaryPart = num1.getRealPart() * num2.getImaginaryPart() + num1.getImaginaryPart() * num2.getRealPart();
        ComplexNumber result = new ComplexNumber(realPart, imaginaryPart);
        log(String.format("multiplication of %s and %s results in %s", num1, num2, result));
        return result;
    }

    @Override
    public ComplexNumber divide(ComplexNumber num1, ComplexNumber num2) {
        double divisor = num2.getRealPart() * num2.getRealPart() + num2.getImaginaryPart() * num2.getImaginaryPart();
        double realPart = (num1.getRealPart() * num2.getRealPart() + num1.getImaginaryPart() * num2.getImaginaryPart()) / divisor;
        double imaginaryPart = (num1.getImaginaryPart() * num2.getRealPart() - num1.getRealPart() * num2.getImaginaryPart()) / divisor;
        ComplexNumber result = new ComplexNumber(realPart, imaginaryPart);
        log(String.format("division of %s and %s results in %s", num1, num2, result));
        return result;
    }

    private void log(String message) {
        try {
            FileHandler fileHandler = new FileHandler("complex_calculator.log", true);
            logger.addHandler(fileHandler);
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
            logger.info(message);
            fileHandler.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
