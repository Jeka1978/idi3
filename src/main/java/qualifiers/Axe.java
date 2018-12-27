package qualifiers;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
@DarkArmy
public class Axe implements Weapon {
    @Override
    public void kick() {
        System.out.println("Axe will kick your ass");
    }

    @Override
    public WeaponType type() {
        return WeaponType.SHORT_DIST;
    }
}
