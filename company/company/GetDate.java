package com.company;

public class GetDate {

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

    public String getSecondNumber(String secondNumber) throws MyNumberExсeption {                              //можно написать 1 метод с параметром для 2 вводимых чисел. Без повторения кода
        int second = Integer.parseInt(secondNumber);
        if (second < 1 || second > 11) {
            throw new MyNumberExсeption("Incorrect second number!");
        }
        return secondNumber;
    }

    public String getSymbol(String expression) throws MySymbolException {
        String[] arraySymbol = {"+", "-", "*", "/"};
        String symbol = null;
        for (String ar:arraySymbol) {
            if (expression.contains(ar)){
                symbol = ar;
            }
        }
        if (symbol == null){throw new MySymbolException("Incorrect symbol");}
        return symbol;
    }

    String calculate(String firstNumber, String symbol, String secondNumber) {
        String resultString = null;
        int first = Integer.parseInt(firstNumber);
        int second = Integer.parseInt(secondNumber);
        int result = 0;
        switch (symbol) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                result = first / second;
                break;
        }
        return resultString = Integer.toString(result);
    }

    public void checkSymbol(String expression) throws MySymbolException {
        String plus = "+";
        String minus = "-";
        String multiply = "*";
        String devison = "/";

        if (expression.contains(plus) ^ expression.contains(minus) ^ expression.contains(multiply) ^ expression.contains(devison)){
        } else throw new MySymbolException("Incorrect symbol");
    }

}