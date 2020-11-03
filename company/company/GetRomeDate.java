package com.company;

import java.util.Scanner;

public class GetRomeDate {

    RomeDigits romeDigits;
    RomeDigits[] romeDigitsArray = RomeDigits.values();
    Scanner scanner = new Scanner(System.in);

    public static boolean containRome(String number){                              //проверяю сразу на риские цифры и на их от 1 до 10.
        for (RomeDigits rome:RomeDigits.values()   ) {                      //если вызов этого метода будет фолсе, то надо ошибку выбрасывать
            if (rome.name().equals(number)){
                return true;
            }
        }
        return false;
    }

    public String getRomeSecondNumber() throws MyRomeNumberException {                 //надо объявлять числа в начале главного метода/ класса
        String secondNumber = scanner.next();                                      //второе число. Если неверное, то ошибка
        if (!containRome(secondNumber)){
            throw new MyRomeNumberException("Roman number expected from 1 to 10");
        }
        return secondNumber;
    }

    String calculateRome(String firstNumber, String symbol, String secondNumber){
        String romeAnswer = null;
        int first = RomeDigits.valueOf(firstNumber).getNumber();
        int second = RomeDigits.valueOf(secondNumber).getNumber();
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
        for (RomeDigits rome:RomeDigits.values()  ) {
            if (rome.getNumber() == result){
                return romeAnswer = rome.name();
            }
        }
        return romeAnswer;
    }

}
