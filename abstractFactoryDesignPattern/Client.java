package abstractFactoryDesignPattern;

public class Client {
    public static void main(String[] args) {
        // get Web Developer;
        EmployeeAbstractFactory employeeAbstractFactory = new WebDevFactory();
        Employee e1 = EmployeeFactory.getEmployee(employeeAbstractFactory);
        System.out.println(e1.getName());

        EmployeeAbstractFactory androidDeveloperFactory = new AndroidDeveloperFactory();
        Employee e2 = EmployeeFactory.getEmployee(androidDeveloperFactory);
        System.out.println(e2.getName());

        EmployeeAbstractFactory employeeAbstractForManagerFactory = new ManagerFactory();
        Employee e3 = EmployeeFactory.getEmployee(employeeAbstractForManagerFactory);
        System.out.println(e3.getName());

    }
}
