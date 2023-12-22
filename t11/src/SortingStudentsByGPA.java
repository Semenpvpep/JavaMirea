import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingStudentsByGPA implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        return Double.compare(student2.getScore(), student1.getScore());
    }

    public void quickSort(List<Student> students, int left, int right) {
        if (left < right) {
            Student pivot = students.get(right);
            int i = left - 1;
            for (int j = left; j < right; j++) {
                if (compare(students.get(j), pivot) < 0) {
                    i++;
                    Student temp = students.get(i);
                    students.set(i, students.get(j));
                    students.set(j, temp);
                }
            }

            Student temp = students.get(i + 1);
            students.set(i + 1, students.get(right));
            students.set(right, temp);

            int pivotIndex = i + 1;
            quickSort(students, left, pivotIndex - 1);
            quickSort(students, pivotIndex + 1, right);
        }
    }


    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Иван", "Иванов", 3, 8.5));
        students.add(new Student(2, "Петр", "Петров", 2, 9.2));
        students.add(new Student(3, "Анна", "Сидорова", 4, 7.8));
        students.add(new Student(4, "Иван", "Иванов", 3, 6.5));
        students.add(new Student(5, "Петр", "Петров", 2, 3.2));
        students.add(new Student(6, "Анна", "Сидорова", 4, 8.8));
        students.add(new Student(7, "Иван", "Иванов", 3, 5.5));
        students.add(new Student(8, "Петр", "Петров", 2, 0.2));
        students.add(new Student(9, "Анна", "Сидорова", 4, 2.8));
        students.add(new Student(10, "Иван", "Иванов", 3, 3.5));
        students.add(new Student(11, "Петр", "Петров", 2, 7.2));
        students.add(new Student(12, "Анна", "Сидорова", 4, 2.8));
        students.add(new Student(13, "Иван", "Иванов", 3, 9.5));
        students.add(new Student(14, "Петр", "Петров", 2, 4.2));
        students.add(new Student(15, "Анна", "Сидорова", 4, 5.8));
        students.add(new Student(16, "Иван", "Иванов", 3, 1.5));
        students.add(new Student(17, "Петр", "Петров", 2, 2.2));
        students.add(new Student(18, "Анна", "Сидорова", 4, 8.8));

        SortingStudentsByGPA comparator = new SortingStudentsByGPA();
        comparator.quickSort(students, 0, students.size() - 1);


        for (Student student : students) {
            System.out.println(student);
        }
    }
}
