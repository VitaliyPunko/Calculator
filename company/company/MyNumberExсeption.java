package com.company;

public class MyNumberExсeption extends Exception {
    MyNumberExсeption(String message){
        super(message);
    }
}

class MySymbolException extends Exception{
    MySymbolException(String message){
        super(message);
    }
}

class MyRomeNumberException extends Exception{
    MyRomeNumberException(String message){
        super(message);
    }
}