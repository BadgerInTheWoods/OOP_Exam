package Controller;

import Model.ComplexNumber;

public interface Calculable {

    ComplexNumber add (ComplexNumber values1, ComplexNumber values2);
    ComplexNumber subtract (ComplexNumber values1, ComplexNumber values2);
    ComplexNumber multiply (ComplexNumber values1, ComplexNumber values2);
    ComplexNumber divide (ComplexNumber values1, ComplexNumber values2);
}
