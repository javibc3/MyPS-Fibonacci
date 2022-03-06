package fibonacci;


public class Fibonacci {

    public int compute(int n) {
        if(n < 0) {
            throw new IllegalArgumentException("Cannot compute fibonacci of a negative number");
        }
        int result = 0;
        int b = 1;
        int c;
        for(int i = 0 ; i < n; i++){
            c = result + b;
            result = b;
            b = c;
        }
        return result;
    }

}
