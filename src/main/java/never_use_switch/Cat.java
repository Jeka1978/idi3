package never_use_switch;

/**
 * @author Evgeny Borisov
 */
public class Cat implements Animal {
    @Override
    public void makeVoice() {
        System.out.println("Mau");
    }
}