package streams;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author Evgeny Borisov
 */
public class PolicyDao {

    private Map<Integer, Policy> cache = new HashMap<>();
    private Map<Integer, Policy> cache2 = new HashMap<>();

    public PolicyDao() {
        cache.put(1, new Policy(1));
        cache.put(2, new Policy(2));
        cache2.put(3, new Policy(3));
        cache2.put(4, new Policy(4));
    }

    public Optional<Policy> findById(int id) {
        return Optional.ofNullable(cache.get(id));
    }
    public Optional<Policy> findById2(int id) {
        return Optional.ofNullable(cache2.get(id));
    }
}




