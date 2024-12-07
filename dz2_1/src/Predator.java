import java.time.LocalDate;

/**
 * Класс Predator - описывает хищников.
 */
public class Predator extends AbstractAnimal {
    public Predator(String breed, String name, Double cost, String character, LocalDate birthDate) {
        super(breed, name, cost, character, birthDate);
    }
}
