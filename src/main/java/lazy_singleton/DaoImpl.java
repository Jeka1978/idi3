package lazy_singleton;

import lombok.SneakyThrows;
import org.springframework.stereotype.Repository;

/**
 * @author Evgeny Borisov
 */
@Repository
public class DaoImpl implements Dao {


    @Override
    public String getData() {
        return "data";
    }
}
