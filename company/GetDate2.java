package com.company;

import java.util.Scanner;

public class GetDate2 {

    Scanner scanner = new Scanner(System.in);


    private String firstNumber;                                                 //хз как лучше написать для ООП и безопасности
    private String secondNumber;
    private String symbol;


    public String getFirstNumber() throws MyNumberExсeption {                  //проверить на целые числа. И так выброситься ошибка при вводе в int числа с дробью?
        firstNumber = scanner.next();


        int first =Integer.parseInt(firstNumber);
        if (first < 1 || first > 11) {
            throw new MyNumberExсeption("Incorrect first number!");
        }
        return firstNumber;
    }

    public String getSecondNumber() throws MyNumberExсeption {
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
}