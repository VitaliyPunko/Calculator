package com.company;

import java.util.Scanner;

public class GetDate {

    Scanner scanner = new Scanner(System.in);

    private String firstNumber;                                                 //хз как лучше написать для ООП и безопасности
    private String secondNumber;
    private String symbol;


//    public String getFirstNumber() throws MyNumberExсeption {                  //проверить на целые числа. И так выброситься ошибка при вводе в int числа с дробью?
//        firstNumber = scanner.next();
//
//        int first =Integer.parseInt(firstNumber);
//        if (first < 1 || first > 11) {
//            throw new MyNumberExсeption("Incorrect first number!");
//        }
//        return firstNumber;
//    }


    public boolean checkFirstNumber(String firstNumber) {
        return Integer.parseInt(firstNumber) >= 1 && Integer.parseInt(firstNumber) <= 11;
    }


    public String getSecondNumber() throws MyNumberExсeption {                              //можно написать 1 метод с параметром для 2 вводимых чисел. Без повторения кода
        secondNumber = scanner.next();

        int second = Integer.parseInt(secondNumber);
        if (second < 1 || second > 11) {
            throw new MyNumberExсeption("Incorrect second number!");
        }
        return secondNumber;
    }

    public String getSymbol() throws MySymbolException {
        symbol = scanner.next();

        switch (symbol){
            case "+": return symbol;
            case "-": return symbol;
            case "*": return symbol;
            case "/": return symbol;
            default:throw new MySymbolException("Incorrect symbol");
        }
    }

    int calculate(String firstNumber, String symbol, String secondNumber){
        int first = Integer.parseInt(firstNumber);
        int second = Integer.parseInt(secondNumber);
        int result = 0;
        switch (symbol){
            case "+": result = first + second;
                break;
            case "-": result = first - second;
                break;
            case "*": result = first * second;
                break;
            case "/": result = first / second;
                break;
        }
        return result;
    }

}