package singleton_vs_testability;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class IsraelMaamResolver implements MaamResolver {
    @Override
    public double getMaam() {
        return 0;
    }
}
