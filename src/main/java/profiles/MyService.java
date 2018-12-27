package profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class MyService {
    @Autowired
    private Dao dao;

    @EventListener(ContextRefreshedEvent.class)
    public void doWork(){
        dao.saveData();
    }
}




