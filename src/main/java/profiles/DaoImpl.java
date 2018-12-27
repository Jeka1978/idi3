package profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

/**
 * @author Evgeny Borisov
 */
@Repository
@Profile("PROD")
public class DaoImpl implements Dao {
    @Override
    public void saveData() {
        System.out.println("saved to prod");
    }
}
