package streams;

/**
 * @author Evgeny Borisov
 */
public class PolicyService {
    private PolicyDao policyDao = new PolicyDao();

    public void processPolicaById(int id) {
        Policy policy = policyDao.findById(id)
                .orElseGet(() -> policyDao.findById2(id)
                        .orElseThrow(() -> new IllegalStateException(id + " not exists"))

                );
    }
}
