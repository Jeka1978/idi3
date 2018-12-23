package method_reference;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        List<Person> list = asList(new Person("Avishay"), new Person("Hadas"));

        list.forEach(Person::printName);
    }
}
