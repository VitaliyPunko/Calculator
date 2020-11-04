package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws Exception {
        GetDate getDate = new GetDate();
        GetRomeDate getRomeDate = new GetRomeDate();

        Scanner scanner = new Scanner(System.in);
        String expressionWithSpace = scanner.nextLine();
        String expression = expressionWithSpace.replaceAll(" ", "");

        getDate.checkSymbol(expression);

        String[] arrayEx = expression.split("[+]|-|[*]|/");

        String firstNumber = arrayEx[0];
        String secondNumber = arrayEx[1];

        String stringResult = null;


        if (getRomeDate.containRome(firstNumber)) {
            try {
                stringResult = getRomeDate.calculateRome(firstNumber, getDate.getSymbol(expression), getRomeDate.getRomeSecondNumber(secondNumber));
                System.out.println(stringResult);
            } catch (MySymbolException | MyRomeNumberException e) {
                e.printStackTrace();
            }
        } else if (getDate.checkFirstNumber(firstNumber)) {
            try {
                stringResult = getDate.calculate(firstNumber, getDate.getSymbol(expression), getDate.getSecondNumber(secondNumber));
                System.out.println(stringResult);
            } catch (MySymbolException e) {
                e.printStackTrace();
            }
        } else {
            throw new MyNumberExсeption("IncorrectFirstNumber");
        }
    }
}