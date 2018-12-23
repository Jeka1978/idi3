package streams;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * @author Evgeny Borisov
 */

@Data
@Builder
public class Employee {
    private int salary;
    private String name;
}

