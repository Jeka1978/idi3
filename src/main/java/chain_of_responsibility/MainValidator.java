package chain_of_responsibility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Service
public class MainValidator {
    @Autowired
    private List<PersonValidator> validators;

    public void printViolations(Person person) {
        validators.stream()
                .flatMap(validator->validator.validate(person))
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("chain_of_responsibility");
        MainValidator mainValidator = context.getBean(MainValidator.class);

        Person person = Person.builder().age(77).name("Jeka").build();
        mainValidator.printViolations(person);
    }
}








