package builder_example;

import lombok.NonNull;

/**
 * @author Evgeny Borisov
 */
public class PolicyService {
    @NonNull
    private Integer age;
    @NonNull
    private Integer vetek;
    @NonNull
    private Integer year;


    @java.beans.ConstructorProperties({"age", "vetek", "year"})
    public PolicyService(Integer age, Integer vetek, Integer year) {
        this.age = age;
        this.vetek = vetek;
        this.year = year;
    }

    public static PolicyServiceBuilder builder() {
        return new PolicyServiceBuilder();
    }

    public static class PolicyServiceBuilder {
        private Integer age;
        private Integer vetek;
        private Integer year;

        PolicyServiceBuilder() {
        }

        public PolicyService.PolicyServiceBuilder age(Integer age) {
            this.age = age;
            return this;
        }

        public PolicyService.PolicyServiceBuilder vetek(Integer vetek) {
            this.vetek = vetek;
            return this;
        }

        public PolicyService.PolicyServiceBuilder year(Integer year) {
            this.year = year;
            return this;
        }

        public PolicyService build() {
            return new PolicyService(age, vetek, year);
        }

        public String toString() {
            return "PolicyService.PolicyServiceBuilder(age=" + this.age + ", vetek=" + this.vetek + ", year=" + this.year + ")";
        }
    }
}
