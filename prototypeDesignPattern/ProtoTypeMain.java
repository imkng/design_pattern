package prototypeDesignPattern;

public class ProtoTypeMain {
    public static void main(String[] args) {
        System.out.println("Creating object by using prototype design pattern!!!");
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("192.168.2.0");
        networkConnection.loadVeryImportantData();
        System.out.println(networkConnection);
        System.out.println("=====new Object of Connection=========================");

        NetworkConnection clone = networkConnection.clone();
        System.out.println(clone);
    }
}
