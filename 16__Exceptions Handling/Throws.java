
// Custom Exception class
class NegativeRadiiException extends Exception {

    @Override
    public String toString() {
        // // TODO Auto-generated method stub
        // return super.toString();
        return "Ayo! wait up, mate, radii can't be negative.";
    }

    @Override
    public String getMessage() {
        // // TODO Auto-generated method stub
        // return super.getMessage();
        return "Ayo! wait up, mate, radii can't be negative.";
    }
}

public class Throws {

    // throws
    /*
     * the `throws` keyword is used in a method signature to indicate that the
     * method may throw one or more checked exceptions. A checked exception is an
     * exception that the method is required to either handle or declare that it may
     * throw.
     */
    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static double areaOfCircle(int radii) throws NegativeRadiiException {
        if (radii < 0) {
            throw new NegativeRadiiException();
        }
        return Math.PI * radii * radii;
    }

    public static void main(String[] args) {
        try {
            System.out.println(areaOfCircle(26));
            // System.out.println(areaOfCircle(-11));
        } catch (NegativeRadiiException e) {
            System.out.println(e);
        }

        try {
            System.out.print(divide(1999, 0));
        } catch (ArithmeticException e) {
            // System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
    }
}
