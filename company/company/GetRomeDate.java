package com.company;

import java.util.Scanner;

public class GetRomeDate {

    RomeDigits romeDigits;
    RomeDigits[] romeDigitsArray = RomeDigits.values();

    public boolean containRome(String number) {                              //проверяю сразу на риские цифры и на их от 1 до 10.
        for (RomeDigitsToTen rome : RomeDigitsToTen.values()) {                      //если вызов этого метода будет фолсе, то надо ошибку выбрасывать
            if (rome.name().equals(number)) {
                return true;
            }
        }
        return false;
    }

    public String getRomeSecondNumber(String RomeSecondNumber) throws MyRomeNumberException {
        if (!containRome(RomeSecondNumber)) {
            throw new MyRomeNumberException("Roman number expected from 1 to 10");
        }
        return RomeSecondNumber;
    }

    String calculateRome(String firstNumber, String symbol, String secondNumber) {
        String romeAnswer = null;
        int first = RomeDigits.valueOf(firstNumber).getNumber();
        int second = RomeDigits.valueOf(secondNumber).getNumber();
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
        for (RomeDigits rome : RomeDigits.values()) {
            if (rome.getNumber() == result) {
                return romeAnswer = rome.name();
            }
        }
        return romeAnswer;
    }

}
