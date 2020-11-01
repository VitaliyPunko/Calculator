import java.util.Scanner;

public class GetDate {

    Scanner scanner = new Scanner(System.in);
    private int firstNumber;
    private int secondNumber;
    private char symbol;


//    public int getFirstNumber() throws MyNumberExсeption {                  //проверить на целые числа. И так выброситься ошибка при вводе в int числа с дробью?
//        int firstNumber = scanner.nextInt();
//
//        return firstNumber ;
//    }
//
//    public int getSecondNumber() {
//        int secondNumber;
//        return secondNumber = scanner.nextInt();
//    }
//
//    public char getSymbol() {
//        char symbol;
//        return symbol = scanner.next().charAt(0);
//    }

    public int getFirstNumber() {

        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) throws MyNumberExсeption {
        this.firstNumber = firstNumber;
        if (firstNumber <1 || firstNumber > 11) {
            throw new MyNumberExсeption("Incorrect first number!");
        }
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) throws MyNumberExсeption {
        this.secondNumber = secondNumber;
        if (secondNumber <1 || secondNumber > 11) {
            throw new MyNumberExсeption("Incorrect second number!");
        }
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) throws MySymbolException {
        this.symbol = symbol;
        if (symbol != '+' || symbol != '-' || symbol != '*' || symbol != '/'){
            throw new MySymbolException();
        }
    }
}
