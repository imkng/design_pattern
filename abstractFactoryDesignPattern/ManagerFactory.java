package abstractFactoryDesignPattern;

public class ManagerFactory extends EmployeeAbstractFactory{
    @Override
    public Employee createEmployee() {
        return new NewManager();
    }
}
