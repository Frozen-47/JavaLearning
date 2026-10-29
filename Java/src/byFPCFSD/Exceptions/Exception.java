package byFPCFSD.Exceptions;
import java.util.*;
public class Exception{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;

        try {
            System.out.print("Enter value of b : ");
            int b = in.nextInt();

            System.out.print("Enter value of c : ");
            int c = in.nextInt();

            a = b / c;
            System.out.println("Done : " + a);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error : " + e);

        } catch (InputMismatchException e) {
            System.out.println("Input Error : " + e);
        }

        in.close();
    }
}
