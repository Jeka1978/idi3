package streams;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
public class Main2 {
    public static void main(String[] args) {
        Stream<Employee> employeeStream = Stream.of(
                Employee.builder().salary(12).name("Jeka").build(),
                Employee.builder().salary(12).name("Jeka").build(),
                Employee.builder().salary(12).name("Jeka").build(),
                Employee.builder().salary(12).name("Jeka").build()
        );
       /* Optional<String> optional = employeeStream.map(Employee::getName)
                .reduce((s, s2) -> s + ", " + s2);

        System.out.println(optional.orElse("Alex"));
*/

        int sum = employeeStream.mapToInt(Employee::getSalary)
                .sum();
        System.out.println("sum = " + sum);


    }
}
