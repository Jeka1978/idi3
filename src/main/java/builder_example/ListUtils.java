package builder_example;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class ListUtils {
    public static <T> int countDuplicates(T t, List<T> list,Equalator<T> equalator ) {
        int counter=0;
        for (T t1 : list) {
            if (equalator.equals(t1,t)) {
                counter++;
            }
        }
        return counter;
    }
}
