package com.company;

public class GetRomeDate {

    RomeDigits romeDigits;
    RomeDigits[] romeDigitsArray = RomeDigits.values();

    public boolean containRome(String number){                              //проверяю сразу на риские цифры и на их от 1 до 10.
        for (RomeDigits rome:RomeDigits.values()   ) {                      //если вызов этого метода будет фолсе, то надо ошибку выбрасывать
            if (rome.name().equals(number)){
                return true;
            }
        }
        return false;
    }

    public String getRomeNumber(String number){                 //надо объявлять числа в начале главного метода/ класса

    }
}
