package qualifiers;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("qualifiers");
        Elf elf = context.getBean(Elf.class);
        Goblin goblin = context.getBean(Goblin.class);
        for (int i = 0; i < 10; i++) {
            goblin.fight();
        }
    }


}
