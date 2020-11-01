import java.util.Scanner;
public class Main {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here
        GetDate getDate = new GetDate();

      //  getDate.setFirstNumber(getDate.getFirstNumber());
        getDate.getFirstNumber();
        getDate.getSecondNumber();
        getDate.getSymbol();



    }

    int calculate(int firstNumber, int secondNumber, char symbol){
        int result = 0;
        switch (symbol){
            case '+': result = firstNumber + secondNumber;
            break;
            case '-': result = firstNumber - secondNumber;
            break;
            case '*': result = firstNumber * secondNumber;
            break;
            case '/': result = firstNumber / secondNumber;
            break;
        }
        return result;
    }

}
