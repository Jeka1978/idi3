package chain_of_responsibility;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
@Component
@Order(1)
public class NullValidator implements PersonValidator {
    @Override
    public Stream<String> validate(Person person) {
        if (person.getEmail() == null) {
            return Stream.of("email is must");
        }
        return Stream.empty();
    }

    @Override
    public int getOrder() {
        return HIGHEST_PRECEDENCE;
    }
}
