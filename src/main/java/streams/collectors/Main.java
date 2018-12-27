package streams.collectors;

import streams.Employee;

import javax.swing.*;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        Stream<Employee> stream = Stream.of(
                Employee.builder().name("Avishay").salary(55000).build(),
                Employee.builder().name("Eldad").salary(35000).build(),
                Employee.builder().name("Evgeny").salary(35000).build(),
                Employee.builder().name("Java").salary(155000).build()
        );
        printGroupBySalaryOnlyName(stream);

    }

    public static void toMapExampleWithMerge(Stream<Employee> stream) {
        Map<String, Integer> map = stream.collect(
                toMap(Employee::getName,
                        Employee::getSalary,
                        (salary1, salary2) -> salary1 + salary2
                ));
        System.out.println(map);
    }


    public static void printGroupBySalary(Stream<Employee> stream) {
        Map<Integer, List<Employee>> map = stream.collect(groupingBy(Employee::getSalary));
        System.out.println(map);
    }

    public static void printGroupBySalaryCounting(Stream<Employee> stream) {
        Map<Integer, Long> map = stream
                .collect(groupingBy(Employee::getSalary, counting()));
        System.out.println(map);
    }

    public static void printGroupBySalaryOnlyName(Stream<Employee> stream) {
        Map<Integer, List<String>> map = stream.collect(
                groupingBy(Employee::getSalary,
                        mapping(Employee::getName, toList())));
        System.out.println(map);
    }
}









