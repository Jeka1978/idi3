package builder_example;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;

/**
 * @author Evgeny Borisov
 */
@Slf4j
public class Main {

    public static void main(String[] args) {
        PolicyService service = PolicyService.builder().age(12).vetek(12).year(1).build();
    }
}
