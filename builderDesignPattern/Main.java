package builderDesignPattern;

public class Main {
    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .setUserId("1L")
                .setUserName("Krishna Nand")
                .setEmail("@gmail.com")
                .build();
        System.out.println(user);
    }
}
