import java.util.Scanner;

public class FactorialSolution {

    public static void main(String[] args) {
        GetNumberFromUser userInput= new GetNumberFromUser();
        int number = userInput.inputUser();

        PrivetNum privetNum = new PrivetNum(number);
        boolean isValid = privetNum.isValid();

        int factorial = 0;

        if(isValid){
            Resulte resulte = new Resulte(number);
            factorial = resulte.calculation();
        }

        DisplayResult display = new DisplayResult();
        display.showReslult(number, isValid,factorial);

    }
}