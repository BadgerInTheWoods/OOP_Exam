package Controller.impl;



import util.Logging;

import Controller.Calculable;
import Model.ComplexNumber;
public class Calculator implements Calculable {

    Logging logging = new Logging();

    @Override
    public ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
        double realPart = num1.getRealPart() + num2.getRealPart();
        double imaginaryPart = num1.getImaginaryPart() + num2.getImaginaryPart();
        ComplexNumber result = new ComplexNumber(realPart, imaginaryPart);
        logging.log(String.format("addition of %s and %s results in %s", num1, num2, result));
        return result;
    }

    @Override
    public ComplexNumber subtract(ComplexNumber num1, ComplexNumber num2) {
        double realPart = num1.getRealPart() - num2.getRealPart();
        double imaginaryPart = num1.getImaginaryPart() - num2.getImaginaryPart();
        ComplexNumber result  = new ComplexNumber(realPart, imaginaryPart);
        logging.log(String.format("subtraction of %s and %s results in %s", num1, num2, result));
        return result;
    }

    @Override
    public ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
        double realPart = num1.getRealPart() * num2.getRealPart() - num1.getImaginaryPart() * num2.getImaginaryPart();
        double imaginaryPart = num1.getRealPart() * num2.getImaginaryPart() + num1.getImaginaryPart() * num2.getRealPart();
        ComplexNumber result = new ComplexNumber(realPart, imaginaryPart);
        logging.log(String.format("multiplication of %s and %s results in %s", num1, num2, result));
        return result;
    }

    @Override
    public ComplexNumber divide(ComplexNumber num1, ComplexNumber num2) {
        double divisor = num2.getRealPart() * num2.getRealPart() + num2.getImaginaryPart() * num2.getImaginaryPart();
        double realPart = (num1.getRealPart() * num2.getRealPart() + num1.getImaginaryPart() * num2.getImaginaryPart()) / divisor;
        double imaginaryPart = (num1.getImaginaryPart() * num2.getRealPart() - num1.getRealPart() * num2.getImaginaryPart()) / divisor;
        ComplexNumber result = new ComplexNumber(realPart, imaginaryPart);
        logging.log(String.format("division of %s and %s results in %s", num1, num2, result));
        return result;
    }


}
