public class Employee {
    String name;
    String post;

    double taxes;
    int salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void setTaxes(double taxes) {
        this.taxes = taxes;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getPost() {
        return post;
    }

    public int getSalary() {
        return salary;
    }

    public double getTaxes() {
        return taxes;
    }
}
