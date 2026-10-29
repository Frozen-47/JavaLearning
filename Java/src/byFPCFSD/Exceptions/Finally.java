package byFPCFSD.Exceptions;
import java.util.*;
public class Finally {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your age : ");
        int age = in.nextInt();
        try{
            if (age < 18){
                throw new ArithmeticException("Error occurs");
            }
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Thanks");
        }
    }
}
