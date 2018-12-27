package streams.collectors;

import streams.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

/**
 * @author Evgeny Borisov
 */
public class EmployeeUtil {
    public static Map<Seniority, List<Employee>> groupBySeniority(List<Employee> employees) {
        return employees.stream().collect(groupingBy(emp -> Seniority.bySalary(emp.getSalary())));
    }


}






