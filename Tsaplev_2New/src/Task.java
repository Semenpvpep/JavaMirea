import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Task {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {

        System.out.println("Номер задания [1; 5]: ");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();

        switch(choice) {
            case 1:
                int[] mas = {10,1,0,-20,145,2,-123,23,5,9,1,7};
                int sum = 0;
                for (int i = 0; i < mas.length; i++) {
                    sum += mas[i];
                }
                System.out.println("Сумма массива с помощью for: " + sum);

                sum = 0;
                int iteration = 0;
                while (iteration < mas.length) {
                    sum += mas[iteration];
                    iteration++;
                }
                System.out.println("Сумма массива с помощью while: " + sum);

                sum = 0;
                iteration = 0;
                do {
                    sum += mas[iteration];
                    iteration++;
                }
                while (iteration < mas.length);
                System.out.println("Сумма массива с помощью do while: " + sum);
                break;
            case 2:

                System.out.println("Аргументы командной строки: ");

                for (int i = 0; i < args.length; i++) {
                    System.out.println(args[i]);
                }
                break;
            case 3:
                System.out.println("Первые 10 чисел гармонического ряда: ");

                for (int i = 1; i <= 10; i++) {
                    System.out.println((1.0)/i);
                }
                break;
            case 4:
                System.out.println("Введите длину массива: ");
                int l = in.nextInt();
                int[] arr = new int[l];
                for (int i = 0; i < l; i++) {
                    arr[i] = (int)(Math.random() * 20);
                }
                System.out.println("Массив: ");
                printArray(arr);
                Arrays.sort(arr);
                System.out.println("Массив после сортировки: ");
                printArray(arr);
                break;
            case 5:
                System.out.println("Введите число: ");
                int f = in.nextInt(), factor = 1;
                for (int i = 1; i <= f; i++) {
                    factor *= i;
                }
                System.out.println("Его факториал: " + factor);
                break;
        }
    }
}
