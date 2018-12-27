package lazy_singleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class MainService {
    @Autowired
    private Dao dao;

    @LazyAutowired
    private HeaveService heaveService;


    public void doWork(){
        String data=null;
        try {
            System.out.println(heaveService.getClass());
            data = heaveService.bringData();
        } catch (Exception e) {
            data = dao.getData();
        }finally {
            processData(data);
        }

    }

    private void processData(String data) {
        System.out.println("data = " + data);
    }
}
