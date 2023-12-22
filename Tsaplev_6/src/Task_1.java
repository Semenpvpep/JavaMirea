import java.util.Scanner;
import java.math.*;

public class Task_1 {
    static SortingStudentsByGPA comp = new SortingStudentsByGPA();

    // БЫСТРАЯ СОРТИРОВКА
    public static void quickSort(Student[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = low + (high - low) / 2;
            Student pivot = array[pivotIndex];

            int i = low;
            int j = high;

            while (i <= j) {
                while (comp.compare(array[i], pivot) < 0) {
                    i++;
                }

                while (comp.compare(array[j], pivot) > 0) {
                    j--;
                }

                if (i <= j) {
                    Student temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    i++;
                    j--;
                }
            }
            quickSort(array, low, j);
            quickSort(array, i, high);
        }
    }

    // СОРТИРОВКА ВСТАВКОЙ
    public static void insertionSort(Student[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            Student key = arr[i];
            int j = i - 1;

            // Перемещаем элементы arr[0..i-1], которые больше key, на одну позицию вперед
            while (j >= 0 && arr[j].idNumber > key.idNumber) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // СОРТИРОВКА СЛИЯНИЕМ
    public static void mergeSort(Student[] array, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;

            mergeSort(array, low, mid);
            mergeSort(array, mid + 1, high);
            merge(array, low, mid, high);
        }
    }

    private static void merge(Student[] array, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;

        Student[] left = new Student[n1];
        Student[] right = new Student[n2];

        if (n1 >= 0) System.arraycopy(array, low, left, 0, n1);
        for (int j = 0; j < n2; ++j) {
            right[j] = array[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = low;
        while (i < n1 && j < n2) {
            if (comp.compare(left[i], right[j]) <= 0) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = left[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = right[j];
            j++;
            k++;
        }
    }

    // MAIN

    public static void main(String[] args) {
        System.out.println("Введите количество студентов: ");
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        Student[] masStudent = new Student[k];

        // ВВОД ИНФОРМАЦИИ О СТУДЕНТАХ

        for (int i = 0; i < k; i++) {
            masStudent[i] = new Student();
            System.out.println("Введите Имя " + (i + 1) + "-го студента");
            masStudent[i].name = in.next();
            System.out.println("Введите ID " + (i + 1) + "-го студента");
            masStudent[i].idNumber = in.nextInt();
            System.out.println("Введите рейтинг " + (i + 1) + "-го студента");
            masStudent[i].rating = in.nextInt();
        }

        // ВЫБОР КРИТЕРИЯ СОРТИРОВКИ

        System.out.println("По какому параметру сортировать? Ввести 1 - по ID, 2 - по рейтингу: ");
        int choice = in.nextInt();
        if (choice == 1) {
            System.out.println("Список студентов до сортировки: ");
            print(masStudent);
            insertionSort(masStudent);
            System.out.println("Список студентов после сортировки: ");
            print(masStudent);
        }
        else if (choice == 2) {
            System.out.println("Список студентов до сортировки: ");
            print(masStudent);
            quickSort(masStudent, 0, masStudent.length - 1);
            System.out.println("Список студентов после сортировки: ");
            print(masStudent);
        }

        // 3 УПРАЖНЕНИЕ

        Student[] array2 = new Student[4];

        for (int i = 0; i < array2.length; i++) {
            array2[i] = new Student();
            array2[i].idNumber = ((int)Math.floor(Math.random() * 44) + 10);
            array2[i].rating = ((int)Math.floor(Math.random() * 14) + 10);
        }

        Student[] array3 = new Student[k + 4];
        System.arraycopy(masStudent, 0, array3, 0, masStudent.length);
        System.arraycopy(array2, 0, array3, masStudent.length, array2.length);

        System.out.println("\n\nСписок студентов до сортировки слиянием (рейтинг): ");
        print(array3);
        mergeSort(array3, 0, array3.length - 1);
        System.out.println("Список студентов после сортировки слиянием (рейтинг): ");
        print(array3);
    }

    // МЕТОД ВЫВОДА МАССИВА

    public static void print(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Студент " + arr[i].name + " имеет ID: " + arr[i].idNumber +
                    ", рейтинг: " + arr[i].rating);
        }
    }
}
