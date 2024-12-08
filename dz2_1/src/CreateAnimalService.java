import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public interface CreateAnimalService {
    default List<AbstractAnimal> createDefaultAnimals() {
        List<AbstractAnimal> animals = new ArrayList<>();
        Random random = new Random();

        int i = 0;
        while (i < 10) {
            animals.add(new Dog("Dog" + i, random.nextDouble(50, 150), "Friendly",
                    LocalDate.of(2019, Month.JANUARY, random.nextInt(1, 28))));
            i++;
        }


        System.out.println("10 животных созданы с помощью while.");
        return animals;
    }

    List<AbstractAnimal> createAnimals(int n);
}
