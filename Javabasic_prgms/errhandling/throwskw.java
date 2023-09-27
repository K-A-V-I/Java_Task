package errhandling;

class throwskw {
    public static int divide(int dividend, int divisor) throws ArithmeticException {
        if (divisor == 0) {
           throw new ArithmeticException("Cannot divide by zero.");
        }
        return dividend / divisor;
    }

    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 0;

        try {
            int result = throwskw.divide(dividend, divisor);
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
