import java.util.Scanner;

class GetNumberFromUser {
    public int inputUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number, please: ");
        return scanner.nextInt();
    }
}