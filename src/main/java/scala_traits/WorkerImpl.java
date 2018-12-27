package scala_traits;

import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class WorkerImpl implements Worker {




    @Override
    public void work() {
        System.out.println("Work was started");
    }

    @Override
    public void close() {
        System.out.println("I love IDI");
    }
}
