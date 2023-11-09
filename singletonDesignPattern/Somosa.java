package singletonDesignPattern;

public class Somosa {
    // static variable have always default value is null
    private static Somosa somosa;

    //1. Constructor Should be private
    private Somosa() {
        if (somosa != null){
            throw new RuntimeException("You are breaking the singleton design property");
        }
    }
    //2. make static method for object creation

    // lazy way of creating object.
    // synchronized used for to ensure thread safety

    public static Somosa getSomosa() {
        // object of this class;
        if (somosa == null) {
            synchronized (Somosa.class) {
                if (somosa == null) {
                    somosa = new Somosa();
                }
            }
        }
        return somosa;
    }
}
// 1. Constructor Should be private
// 2. make static method for object creation
// 3. create field to store object is private
