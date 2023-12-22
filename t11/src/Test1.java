import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        Student s1 = new Student(2, "Ivan", "Ivanov", 1, 8.5);
        Student s2 = new Student(1, "Igor", "Petrov", 3, 8.2);
        Student s3 = new Student(3, "Petr", "Sidorov", 2, 8.7);
        List<Student> iDNumber = new ArrayList<>();
        iDNumber.add(s1);
        iDNumber.add(s2);
        iDNumber.add(s3);

        insertionSort(iDNumber);

        for (Student student: iDNumber){
            System.out.println(student);
        }
    }

    public static void insertionSort(List<Student> students) {
        for (int i = 1; i < students.size(); i++) {
            Student currentStudent = students.get(i);
            int j = i - 1;
            while (j >= 0 && students.get(j).getId() > currentStudent.getId()) {
                students.set(j + 1, students.get(j));
                j -= 1;
            }
            students.set(j + 1, currentStudent);
        }
    }
}
