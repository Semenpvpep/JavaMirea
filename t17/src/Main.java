import java.util.Scanner;

public class Main{
    public static void main(String... args) {
        int[] massINN = new int[20];
        System.out.println("Все ИНН: ");
        for (int i = 0; i < 20; i++){
            massINN[i] = (int)(Math.random() * 100000);
            System.out.println(massINN[i]);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ФИО: ");
        String name = scanner.nextLine();
        System.out.println("Введите ИНН: ");
        int INN = scanner.nextInt();
        try{
            notINN(massINN, INN, name);
        } catch (NotINNException e){
            System.out.println(e.getLocalizedMessage());
            return;
        }
        catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Имя: " + name + "\nИНН:" + INN + "\nНайден\n");
    }

    public static void notINN(int[] massINN, int INN, String name) throws NotINNException{
        for (int i : massINN) {
            if (INN == i) {
                return;
            }
        }
        throw new NotINNException(name, INN);
    }
}