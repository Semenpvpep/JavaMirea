public class MVCEmployee {
    public static void main(String... args){
        Employee employeeModel = retrieveEmployeeFromDatabase();
        EmployeeView employeeView = new EmployeeView();

        EmployeeController employeeController = new EmployeeController(employeeView, employeeModel);

        employeeController.updateView();

        employeeController.setPost("Директор компании");
        employeeController.setSalary(9999991);

        System.out.println("\nОбновление!\n");
        employeeController.updateView();
    }

    static Employee retrieveEmployeeFromDatabase(){
        Employee employee = new Employee();
        employee.setName("Катя");
        employee.setPost("Разнорабочий");
        employee.setSalary(500);
        employee.setTaxes(0.15);
        return employee;
    }
}
