package lazy_singleton;

import lombok.SneakyThrows;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
@Lazy
public class HeaveService {

    @SneakyThrows
    public HeaveService() {
        System.out.println("staring heavy data loading process...");
        Thread.sleep(5000);
    }

    public String bringData() {
        return "heavy data";
    }
}
