package qualifiers;

import org.springframework.stereotype.Component;

import static qualifiers.WeaponType.SHORT_DIST;

/**
 * @author Evgeny Borisov
 */
@Component
@BrightArmy
public class Sword implements Weapon {
    @Override
    public void kick() {
        System.out.println("Sword kick you");
    }

    @Override
    public WeaponType type() {
        return SHORT_DIST;
    }
}
