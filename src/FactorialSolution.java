import java.util.Scanner;

public class FactorialSolution {

    private int number;


    public FactorialSolution(int number){
        this.number = number;
    }

    public int calculator(){
        int resulte = 1;
        for(int i = 1; i <= number; i++){
            resulte *=i;
        }
        return resulte;
    }

    public boolean isValid(){
        return number >= 0;
    }

    public int getNumber(){
        return number;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate factorial number : ");
        int number = scanner.nextInt();

        FactorialSolution calculation = new FactorialSolution(number);
        if(calculation.isValid()){
            System.out.println("The factorial of"+ " " + calculation.getNumber() + " " + "is" + " " + calculation.calculator());
        }else {
            System.out.println("Factorial number is not valid to calculation");
        }

        System.out.println("Hello world!");
    }
}