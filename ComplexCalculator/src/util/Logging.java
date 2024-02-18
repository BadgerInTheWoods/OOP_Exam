package util;


import Controller.impl.Calculator;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Logging {

    private static final Logger logger = Logger.getLogger(Calculator.class.getName());

    public void log(String message) {
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
