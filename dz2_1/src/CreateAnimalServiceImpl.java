import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Реализация сервиса создания животных.
 */
public class CreateAnimalServiceImpl implements CreateAnimalService {

    @Override
    public AbstractAnimal generateAnimal() {
        Random random = new Random();
        String[] breeds = {"Wolf", "Shark", "Dog", "Cat"};
        String[] names = {"Rex", "Luna", "Max", "Bella"};
        String[] characters = {"Friendly", "Aggressive", "Calm", "Playful"};
        double cost = 50 + random.nextDouble() * 200;
        LocalDate birthDate = LocalDate.of(2000 + random.nextInt(25), Month.of(1 + random.nextInt(12)), 1 + random.nextInt(28));

        if (random.nextBoolean()) {
            return new Predator(
                    breeds[random.nextInt(breeds.length)],
                    names[random.nextInt(names.length)],
                    cost,
                    characters[random.nextInt(characters.length)],
                    birthDate
            );
        } else {
            return new Pet(
                    breeds[random.nextInt(breeds.length)],
                    names[random.nextInt(names.length)],
                    cost,
                    characters[random.nextInt(characters.length)],
                    birthDate
            );
        }
    }

    /**
     * Перегруженный метод для создания N животных.
     * @param n Количество животных.
     * @return Список животных.
     */
    public List<AbstractAnimal> createAnimals(int n) {
        List<AbstractAnimal> animals = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            animals.add(generateAnimal());
        }
        return animals;
    }

    /**
     * Переопределённый метод для создания животных с do-while.
     * @param n Количество животных.
     * @return Список животных.
     */
    public List<AbstractAnimal> createAnimalsDoWhile(int n) {
        List<AbstractAnimal> animals = new ArrayList<>();
        int count = 0;
        do {
            animals.add(generateAnimal());
            count++;
        } while (count < n);
        return animals;
    }
}