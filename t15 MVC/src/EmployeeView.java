public class EmployeeView {
    public void printEmployeeDetails(String name, String post, double taxes, int salary){
        System.out.println("Паспорт рабочего:");
        System.out.println("Имя - " + name);
        System.out.println("Должность - " + post);
        System.out.println("Зарплата - " + salary);
        System.out.println("Зарплата после вычета налогов - " + (salary * (1 - taxes)));
    }
}
