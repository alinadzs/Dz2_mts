import java.time.LocalDate;

/**
 * Класс Pet - описывает домашних животных.
 */
public class Pet extends AbstractAnimal {
    public Pet(String breed, String name, Double cost, String character, LocalDate birthDate) {
        super(breed, name, cost, character, birthDate);
    }
}