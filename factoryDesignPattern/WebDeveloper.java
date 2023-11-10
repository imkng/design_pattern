package factoryDesignPattern;

public class WebDeveloper implements Employee{
    @Override
    public int getSalary() {
        System.out.println("Getting web developer salary");
        return 40000;
    }
}
