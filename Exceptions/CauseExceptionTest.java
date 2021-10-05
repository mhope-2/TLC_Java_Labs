package Exceptions;

public class CauseExceptionTest {
    public static void main(String[] args) {
        CauseException causeException = new CauseException(12.00);
        System.out.println( causeException.divide(0.00));
    }
}
