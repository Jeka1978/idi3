package lazy_singleton;/**
 * @author Evgeny Borisov
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Autowired
@Lazy
public @interface LazyAutowired {
}
