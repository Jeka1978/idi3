package never_use_switch;

/**
 * @author Evgeny Borisov
 */
public class Dog implements Animal {

    private int repeat=3;

    @Override
    public void makeVoice() {
        for (int i = 0; i < repeat; i++) {
            System.out.print("au ");
        }
        System.out.println();
        repeat--;
    }
}
