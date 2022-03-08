package fibonacci;

/**
 * Clase que implementa la el valor de la serie de fibonacci que se le introduce por parametro
 *
 * @author Javier Bonilla Calero
 */


public class Fibonacci {

    /**
     * Metodo que implementa la propia computacion de la serie de fibonacci
     * @param n Valor de la serie que se quiere calcular
     * @return El valor correspondiente en la serie de fibonacci
     */

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
