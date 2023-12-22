public class Exception1 {
    public void exceptionDemo() {
        try{
        System.out.println( 2 / 0 );}
        catch (ArithmeticException e){System.out.println("Attempt divizion by zero");}
    }

    public static void main(String[] args) {
        new Exception1().exceptionDemo();
    }
}
