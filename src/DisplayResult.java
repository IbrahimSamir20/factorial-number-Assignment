public class DisplayResult {
    public void showReslult (int number , boolean isValid, int factorial){
        if(isValid){
            System.out.println("The factorial of " + " " + number + " is : " + " " + factorial);
        }else {
            System.out.println("Invalid input ! please enter a non-negative number.");
        }
    }
}
