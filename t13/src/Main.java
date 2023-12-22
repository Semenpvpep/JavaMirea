import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String... args) throws Exception {
        System.out.println("Введите запись для файла: ");
        try(FileWriter writer = new FileWriter("C:\\Users\\123\\Desktop\\ДЖАВА\\t13\\OUT.txt", true)){
            writer.write((new Scanner(System.in)).nextLine());
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("\nВывод: ");
        try (FileReader reader = new FileReader("C:\\Users\\123\\Desktop\\ДЖАВА\\t13\\OUT.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char)c);
            }
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}