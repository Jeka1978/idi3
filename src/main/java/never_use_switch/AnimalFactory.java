package never_use_switch;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

/**
 * @author Evgeny Borisov
 */
public class AnimalFactory {
    private List<Supplier<Animal>> animalSuppliers = new ArrayList<>();


    public AnimalFactory() {

        animalSuppliers.add(Cat::new);
        animalSuppliers.add(() -> new Dog());
    }

    public Animal createRandom() {
        Random random = new Random();
        int i = random.nextInt(animalSuppliers.size());
        return animalSuppliers.get(i).get();
    }

    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        for (int i = 0; i < 10; i++) {
            animalFactory.createRandom().makeVoice();
        }
    }
}






