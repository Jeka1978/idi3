package streams.collectors;

import org.junit.Assert;
import org.junit.Test;
import streams.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;
import static streams.collectors.Seniority.JUNIOR;
import static streams.collectors.Seniority.MIDDLE;
import static streams.collectors.Seniority.SENIOR;

/**
 * @author Evgeny Borisov
 */
public class EmployeeUtilTest {

    @Test
    public void groupBySeniority() {

        List<Employee> employees = asList(
                Employee.builder().name("Avishay").salary(5000).build(),
                Employee.builder().name("Eldad").salary(35000).build(),
                Employee.builder().name("Evgeny").salary(35000).build(),
                Employee.builder().name("Java").salary(5000).build()
        );

        Map<Seniority, List<Employee>> map = EmployeeUtil.groupBySeniority(employees);
        Assert.assertEquals(2,map.get(JUNIOR).size());
        Assert.assertNull(map.get(MIDDLE));
        Assert.assertEquals(2,map.get(SENIOR).size());


    }
}