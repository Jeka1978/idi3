package method_reference;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Evgeny Borisov
 */
@Data
@AllArgsConstructor
public class Person {
    private String name;

    public void printName(Person p) {
        System.out.println(p.name);
    }
    public void printName() {
        System.out.println(name);
    }

}
