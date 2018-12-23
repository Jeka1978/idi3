package builder_example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class ListUtilsTest {

    @Test
    public void countDuplicates() {
        List<String> strings = asList("java", "Java", "scala", "JAVA");


        int i = ListUtils.countDuplicates("java", strings, (t1, t2) -> t1.equalsIgnoreCase(t2));
        Assert.assertEquals(3,i);
    }
}