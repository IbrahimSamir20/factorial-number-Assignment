public class Resulte extends PrivetNum {
    public Resulte(int number) {
        super(number);
    }

    public int calculation(){
        int number = getNumber();
        int resulte = 1;
        for (int i = 1; i <= number ; i++){
            resulte *= i;
        }
        return  resulte;
    }
}
