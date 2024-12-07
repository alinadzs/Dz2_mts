import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Интерфейс для создания животных.
 */
public interface CreateAnimalService {
    /**
     * Метод для создания 10 уникальных животных.
     * @return Список животных.
     */
    default List<AbstractAnimal> createAnimals() {
        List<AbstractAnimal> animals = new ArrayList<>();
        int count = 0;
        while (count < 10) {
            animals.add(generateAnimal());
            count++;
        }
        return animals;
    }

    /**
     * Генерация одного животного.
     * @return Новый объект животного.
     */
    AbstractAnimal generateAnimal();
}

