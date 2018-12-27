package profiles;

import org.springframework.context.annotation.*;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
public class Conf {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(Conf.class);
    }
}
