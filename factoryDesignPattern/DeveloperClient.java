package factoryDesignPattern;

public class DeveloperClient {

    public static void main(String[] args) {
//        this is not loosely coupled
//        Employee employee = new AndroidDeveloper();

        Employee employee = EmployeeFactory.getEmployee("ANDROID DEVELOPER");
        System.out.println(employee.getSalary());

        Employee employee1 = EmployeeFactory.getEmployee("WEB DEVELOPER");
        System.out.println(employee1.getSalary());

    }
}
