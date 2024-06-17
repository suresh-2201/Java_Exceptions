package Java_Exceptions;

public class GenerateArithmeticException {

    public static void main(String[] args) {
        int a = 10, b = 0, c;
        try {
            //below code throws divide by zero exception
            c = a / b;

            //handles the Arithmetic Exception / Divide by zero exception
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException caught!");
            /* printStackTrace() prints the throwable Exception object as well as with other Information
            like the line number where Exception occurs and class name where the exception occurred.*/
            e.printStackTrace();
        }
    }
}