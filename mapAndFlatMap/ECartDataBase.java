package mapAndFlatMap;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ECartDataBase {
    public static List<Customer> getAllCustomer(){
        return Stream.of(
                new Customer(1, "Jhon", "jhon@gmail.com", List.of("+910903232")),
                new Customer(2, "Jhon1", "jhon1@gmail.com", List.of("+910903232", "lwqe20i2038")),
                new Customer(3, "Jhon2", "jhon2@gmail.com", List.of("+910903232", "13452123")),
                new Customer(4, "Jhon3", "jhon3@gmail.com", List.of("+910903232", "134523121344"))
        ).collect(Collectors.toList());
    }
}
