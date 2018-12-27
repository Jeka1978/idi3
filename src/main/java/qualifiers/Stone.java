package qualifiers;

import org.springframework.stereotype.Component;

import static qualifiers.WeaponType.LONG_DIST;

/**
 * @author Evgeny Borisov
 */
@Component
@DarkArmy
public class Stone implements Weapon {
    @Override
    public void kick() {
        System.out.println("Stone will kill you");
    }

    @Override
    public WeaponType type() {
        return LONG_DIST;
    }
}
