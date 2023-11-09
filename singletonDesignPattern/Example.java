package singletonDesignPattern;

public class Example {
    public static void main(String[] args) {
        // Somosa somosa = new Somosa();
        Somosa somosa = Somosa.getSomosa();
        System.out.println(somosa.hashCode());
        Somosa somos2 = Somosa.getSomosa();
        System.out.println(somos2.hashCode());

        System.out.println("================================");
        Jalebi jalebi = Jalebi.getJalebi();
        Jalebi jalebi1 = Jalebi.getJalebi();
        System.out.println(jalebi1.hashCode());
        System.out.println(jalebi.hashCode());
    }
}
