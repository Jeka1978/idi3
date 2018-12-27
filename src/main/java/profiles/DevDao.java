package profiles;

import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

/**
 * @author Evgeny Borisov
 */
@Repository
@Profile("DEV")
@Conditional(MyCond.class)
//spring.profiles.active=DEV
public class DevDao implements Dao {
    @Override
    public void saveData() {
        System.out.println("saved to DEV");
    }
}
