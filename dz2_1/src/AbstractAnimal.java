import java.time.LocalDate;
/**
 * Абстрактный класс AbstractAnimal.
 * Содержит основные поля и методы для всех животных.
 */
public abstract class AbstractAnimal implements Animal {
    protected String breed;       // Порода
    protected String name;        // Имя
    protected Double cost;        // Цена
    protected String character;   // Характер
    protected LocalDate birthDate; // Дата рождения

    // Конструктор
    public AbstractAnimal(String breed, String name, Double cost, String character, LocalDate birthDate) {
        this.breed = breed;
        this.name = name;
        this.cost = cost;
        this.character = character;
        this.birthDate = birthDate;
    }

    // Реализация интерфейса Animal
    @Override
    public String getBreed() {
        return breed;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getCost() {
        return cost;
    }

    @Override
    public String getCharacter() {
        return character;
    }

    @Override
    public LocalDate getBirthDate() {
        return birthDate;
    }

    // Переопределение equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        AbstractAnimal that = (AbstractAnimal) obj;

        return breed.equals(that.breed) &&
                name.equals(that.name) &&
                cost.equals(that.cost) &&
                character.equals(that.character) &&
                birthDate.equals(that.birthDate);
    }
}
