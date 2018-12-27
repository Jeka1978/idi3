package chain_of_responsibility;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
@Component
@Order(2)
public class AgeValidator implements PersonValidator {
    @Override
    public Stream<String> validate(Person person) {
        Stream.Builder<String> builder = Stream.builder();

        if (person.getAge() < 0) {
            builder.add("age can't be <0");
        }
        if (person.getAge() > 120) {
            builder.add("age too big");
        }
        return builder.build();
    }
}
