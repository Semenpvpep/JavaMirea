public class EmployeeController {
    Employee employee;
    EmployeeView view;
    public EmployeeController(EmployeeView view, Employee employee){
        this.employee = employee;
        this.view = view;
    }

    public void updateView(){
        view.printEmployeeDetails(employee.getName(), employee.getPost(), employee.getTaxes(), employee.getSalary());
    }

    public void setName(String name) {
        employee.name = name;
    }

    public void setPost(String post) {
        employee.post = post;
    }

    public void setTaxes(double taxes) {
        employee.taxes = taxes;
    }

    public void setSalary(int salary) {
        employee.salary = salary;
    }

    public String getName() {
        return employee.name;
    }

    public String getPost() {
        return employee.post;
    }

    public int getSalary() {
        return employee.salary;
    }

    public double getTaxes() {
        return employee.taxes;
    }
}
