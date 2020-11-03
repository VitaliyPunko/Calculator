package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws MyNumberExсeption {

        Scanner scanner = new Scanner(System.in);
        String firstNumber = scanner.next();

//        if (scanner.hasNextInt()) {
//            firstNumber = scanner.next();
//        }


        GetDate getDate = new GetDate();
        Main main = new Main();
        GetRomeDate getRomeDate = new GetRomeDate();

        int result = 0;
        String stringResult = null;


        if (GetRomeDate.containRome(firstNumber)) {
            try {
                stringResult = getRomeDate.calculateRome(firstNumber, getDate.getSymbol(), getRomeDate.getRomeSecondNumber());
            } catch (MySymbolException | MyRomeNumberException e) {
                e.printStackTrace();
            }
        } else if (getDate.checkFirstNumber(firstNumber)) {
            try {
                result = getDate.calculate(firstNumber, getDate.getSymbol(), getDate.getSecondNumber());
            } catch (MySymbolException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Something wrong");
        }

        if (result == 0)System.out.println(stringResult);
        else System.out.println(result);

    }
}