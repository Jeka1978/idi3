package chain_of_responsibility;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
@Component
@Order(4)
public class NameValidator implements PersonValidator {
    @Override
    public Stream<String> validate(Person person) {
        if (person.getName().length() > 10) {
            return Stream.of("name too long");
        }
        return Stream.empty();
    }
}
