package mapAndFlatMap;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMapMain {
    public static void main(String[] args) {
        List<Customer> customerList = ECartDataBase.getAllCustomer();
        // process stream of value
        List<String> emails = customerList.stream().map(Customer::getEmail).toList();
        System.out.println(emails);

        List<List<String>> collect = customerList.stream().map(Customer::getPhoneNumbers).collect(Collectors.toList());
        System.out.println(collect);

        //flatmap process stream of stream of values
        List<String> phoneNumbers = customerList.stream().flatMap(customer -> customer.getPhoneNumbers().stream()).collect(Collectors.toList());
        System.out.println(phoneNumbers);
    }
}
