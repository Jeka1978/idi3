package multiple_inheritance;

/**
 * @author Evgeny Borisov
 */
public class Son implements Father,Mother {

    @Override
    public void speak() {
        Mother.super.speak();
    }


    public static void main(String[] args) {
        new Son().speak();
    }
}
