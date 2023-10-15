package org.example;

import org.example.controller.CalculatorController;
import org.example.model.ComplexNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        ComplexNumber number1 = new ComplexNumber(5,2);
//        System.out.println(number1);
        CalculatorController calculatorController = new CalculatorController();
        do {
            calculatorController.initProgram();
            calculatorController.getResult();
            System.out.println("""
                Want to try again?
                1 - yes
                2 - no
                """);
        } while (!new Scanner(System.in).next().equals("2"));
    }
}