package fibonacci;


public class Fibonacci {

    public int compute(int i) {
        if(i < 0) {
            throw new IllegalArgumentException("Cannot compute fibonacci of a negative number");
        }
        else if(i == 1 || i == 2){
            return 1;
        }
        else{
            return 0;
        }
    }

}
