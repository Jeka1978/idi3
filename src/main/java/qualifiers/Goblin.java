package qualifiers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static qualifiers.WeaponType.LONG_DIST;
import static qualifiers.WeaponType.SHORT_DIST;

/**
 * @author Evgeny Borisov
 */
@Service
@Scope("prototype")
public class Goblin implements Character {
    private int dist = 2;

    private Map<WeaponType, List<Weapon>> weapons = new HashMap<>();

    private Weapon currentWeapon;


    @Autowired
    @DarkArmy
    public Goblin(List<Weapon> weapons) {
        this.weapons = weapons.stream().collect(groupingBy(Weapon::type));
    }

    @Override
    public void fight() {

        if (dist > 0) {
            currentWeapon = RandomFactory.randomWeapon(weapons.get(LONG_DIST));
        }else {
            currentWeapon = RandomFactory.randomWeapon(weapons.get(SHORT_DIST));
        }
        currentWeapon.kick();
        dist--;
    }
}






