package qualifiers;

import java.util.List;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */
public class RandomFactory {
    private static Random random = new Random();
    public static Weapon randomWeapon(List<Weapon> weapons) {
        return weapons.get(random.nextInt(weapons.size()));
    }
}
