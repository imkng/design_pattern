package factoryDesignPattern;

public class EmployeeFactory {
    public static Employee getEmployee(String emp){
        if (emp.trim().equalsIgnoreCase("ANDROID DEVELOPER")){
            return new AndroidDeveloper();
        } else if(emp.trim().equalsIgnoreCase("WEB DEVELOPER")){
            return new WebDeveloper();
        }
        return null;
    }
}
