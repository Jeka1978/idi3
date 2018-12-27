package qualifiers;

import org.springframework.stereotype.Component;

import static qualifiers.WeaponType.LONG_DIST;

/**
 * @author Evgeny Borisov
 */
@Component
@BrightArmy
public class Bow implements Weapon {
    @Override
    public void kick() {
        System.out.println("Bow ,,,");
    }

    @Override
    public WeaponType type() {
        return LONG_DIST;
    }
}
