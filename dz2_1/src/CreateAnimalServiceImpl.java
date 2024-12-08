import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreateAnimalServiceImpl implements CreateAnimalService {

    @Override
    public List<AbstractAnimal> createAnimals(int n) {
        List<AbstractAnimal> animals = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                animals.add(new Dog("Dog" + i, random.nextDouble(50, 150), "Friendly",
                        LocalDate.of(2020, random.nextInt(1, 13), random.nextInt(1, 28))));
            } else {
                animals.add(new Shark("Shark" + i, random.nextDouble(200, 500), "Aggressive",
                        LocalDate.of(2015, random.nextInt(1, 13), random.nextInt(1, 28))));
            }
        }

        System.out.println(n + " животных созданы с помощью for.");
        return animals;
    }

    public List<AbstractAnimal> createAnimalsDoWhile(int n) {
        List<AbstractAnimal> animals = new ArrayList<>();
        Random random = new Random();

        int i = 0;
        do {
            if (i % 2 == 0) {
                animals.add(new Wolf("Wolf" + i, random.nextDouble(80, 200), "Aggressive",
                        LocalDate.of(2015, random.nextInt(1, 13), random.nextInt(1, 28))));
            } else {
                animals.add(new Shark("Shark" + i, random.nextDouble(200, 500), "Aggressive",
                        LocalDate.of(2016, random.nextInt(1, 13), random.nextInt(1, 28))));
            }
            i++;
        } while (i < n);

        System.out.println(n + " животных созданы с помощью do-while.");
        return animals;
    }
}


