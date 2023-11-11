package abstractFactoryDesignPattern;

public class AndroidDeveloper implements Employee{
    @Override
    public int salary() {
        return 50000;
    }

    @Override
    public String getName() {
        System.out.println("I am android developer!!");
        return "ANDROID DEVELOPER";
    }
}
