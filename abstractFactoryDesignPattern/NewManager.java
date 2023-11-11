package abstractFactoryDesignPattern;

public class NewManager implements Employee{
    @Override
    public int salary() {
        return 100000;
    }

    @Override
    public String getName() {
        System.out.println("I am a manager!!");
        return "Manager";
    }
}
