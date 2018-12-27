package qualifiers;

import org.springframework.stereotype.Component;

import static qualifiers.WeaponType.SHORT_DIST;

/**
 * @author Evgeny Borisov
 */
@Component
@BrightArmy
@DarkArmy
public class Knife implements Weapon {
    @Override
    public void kick() {
        System.out.println("knife will cut you throat");
    }

    @Override
    public WeaponType type() {
        return SHORT_DIST;
    }
}
