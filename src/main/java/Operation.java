public class Operation {

    public static int multiplier(int x, int y) {
        return x * y;
    }

    public static int soustraction(int x, int y){
        return x - y;
    }

    public static int addition(int x, int y){
        return x + y;
    }

    public static double division(int x, int y){
        if ( y != 0) {
            return (double) x / y;
        }
        return 0;
    }
}
