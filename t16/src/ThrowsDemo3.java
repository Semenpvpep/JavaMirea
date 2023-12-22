import java.util.Objects;
import java.util.Scanner;

public class ThrowsDemo3 {
    public void getKey() {
        Scanner myScanner = new Scanner( System.in );
        while (true) {
            String key = myScanner.nextLine();
            try {
                printDetails(key);
                return;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println( message );

    }
    private String getDetails(String key) throws Exception {
        if(Objects.equals(key, "")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        new ThrowsDemo3().getKey();
    }
}
