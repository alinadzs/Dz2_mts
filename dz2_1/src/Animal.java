import java.time.LocalDate;

/**
 * Интерфейс Animal для описания поведения животных.
 */
public interface Animal {
    String getBreed();       // Получить породу
    String getName();        // Получить имя
    Double getCost();        // Получить цену
    String getCharacter();   // Получить характер
    LocalDate getBirthDate(); // Получить дату рождения
}