package com.company;

import java.util.Scanner;
public class Main {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        GetDate getDate = new GetDate();
//        try {
//
//            getDate.getFirstNumber();
//            getDate.getSymbol();
//            getDate.getSecondNumber();
//            System.out.println(getDate.getFirstNumber() + getDate.getSymbol() +  getDate.getSecondNumber());
//
//        } catch (MyNumberExсeption | MySymbolException myExсeption)   {
//            myExсeption.printStackTrace();
//        }


        Main main = new Main();
        try {
            System.out.println(main.calculate(getDate.getFirstNumber(), getDate.getSymbol(), getDate.getSecondNumber()));
        } catch (MyNumberExсeption myNumberExсeption) {
            myNumberExсeption.printStackTrace();
        } catch (MySymbolException e) {
            e.printStackTrace();
        };


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