import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        Student s1 = new Student(2, "Ivan", "Ivanov", 1, 7.5);
        Student s2 = new Student(1, "Igor", "Petrov", 3, 8.4);
        Student s3 = new Student(3, "Petr", "Sidorov", 2, 5.7);
        List<Student> students1 = new ArrayList<>();
        students1.add(s1);
        students1.add(s2);
        students1.add(s3);

        s1 = new Student(1, "Maxim", "Ignatev", 2, 7.7);
        s2 = new Student(2, "Dmitry", "Nosov", 3, 9.3);
        s3 = new Student(3, "Leonid", "Frolov", 2, 8.9);

        List<Student> students2 = new ArrayList<>();
        students2.add(s1);
        students2.add(s2);
        students2.add(s3);

        SortingStudentsByGPA comparator = new SortingStudentsByGPA();
        comparator.quickSort(students1, 0, students1.size() - 1);
        comparator.quickSort(students2, 0, students2.size() - 1);


        List<Student> mergedList = mergeSort(students1, students2);

        for(Student student: mergedList){
            System.out.println(student);
        }

    }

    public static List<Student> mergeSort(List<Student> list1, List<Student> list2){
        List<Student> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        while(i < list1.size() && j < list2.size()){
            if(list1.get(i).getScore() >= list2.get(j).getScore()){
                mergedList.add(list1.get(i));
                i++;
            }
            else{
                mergedList.add(list2.get(j));
                j++;
            }
        }

        while(i < list1.size()){
            mergedList.add(list1.get(i));
            i++;
        }

        while(j < list2.size()){
            mergedList.add(list2.get(j));
            j++;
        }
        return mergedList;
    }
}
