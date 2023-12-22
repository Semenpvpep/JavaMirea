public class Student implements Comparable<Student>{
    private int id;
    private String name;
    private String surname;
    private int course;
    private double score;

    public Student(int id, String name, String surname, int course, double score) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
