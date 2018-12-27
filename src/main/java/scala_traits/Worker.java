package scala_traits;
import javax.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

/**
 * @author Evgeny Borisov
 */
public interface Worker {

    @Autowired
    default void preWork(SuperService superService) {
        superService.killAll();
    }


    @PostConstruct
    default void doWork() {
        work();
    }


    void work();

    @EventListener(ContextClosedEvent.class)
    void close();


}
