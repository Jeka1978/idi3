package chain_of_responsibility;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
@Component
@Order(3)
public class EmailValidator implements PersonValidator {
    @Override
    public Stream<String> validate(Person person) {

        Stream.Builder<String> builder = Stream.builder();
        if (!person.getEmail().contains("@")) {
            builder.add("@ is must in your mail");
        }
        if (!person.getEmail().contains(".")) {
            builder.add(". is must in your mail");
        }
        return builder.build();
    }
}
