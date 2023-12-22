import java.util.Scanner;

public class Exception2 {
    public static void main(String... args) {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        try {
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }

        //catch (Exception a){System.out.println("Exception");}
        catch(ArithmeticException e){System.out.println("На ноль нельзя делить");}
        catch (NumberFormatException e){System.out.println("Введите числа");}
        finally {
            System.out.println("FINALLY");
        }
    }
}
