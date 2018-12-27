package qualifiers;

import org.springframework.stereotype.Component;

import static qualifiers.WeaponType.LONG_DIST;
import static qualifiers.WeaponType.SHORT_DIST;

/**
 * @author Evgeny Borisov
 */
@Army(ArmyType.BRIGHT)
public class Spear implements Weapon {
    @Override
    public void kick() {
        System.out.println("Spear Spear");
    }

    @Override
    public WeaponType type() {
        return LONG_DIST;
    }
}
