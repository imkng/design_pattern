package abstractFactoryDesignPattern;

public class WebDeveloper implements Employee{
    @Override
    public int salary() {
        return 40000;
    }

    @Override
    public String getName() {
        System.out.println("I am web developer!!");
        return "Web DEVELOPER";
    }
}
