package chain_of_responsibility;

import lombok.Builder;
import lombok.Data;

/**
 * @author Evgeny Borisov
 */
@Data
@Builder
public class Person {
    private String name;
    private int age;
    private String email;
}
