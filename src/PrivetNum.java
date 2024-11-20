public class PrivetNum {
    private final int number;

    public PrivetNum(int number){
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public boolean isValid(){
        return number >= 0;
    }

}
