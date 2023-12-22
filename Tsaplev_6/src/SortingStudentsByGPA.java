import java.util.Comparator;
public class SortingStudentsByGPA implements Comparator{
    @Override
    public int compare(Object s1, Object s2) {
        return ((Student) s1).rating - ((Student) s2).rating;
    }
}
