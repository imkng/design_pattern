package factoryDesignPattern;

public class AndroidDeveloper implements Employee{
    @Override
    public int getSalary() {
        System.out.println("Getting android developer salary!!");
        return 50000;
    }
}
