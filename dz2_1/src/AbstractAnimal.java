import java.time.LocalDate;

public abstract class AbstractAnimal implements Animal {
    protected String breed;      // порода
    protected String name;       // имя
    protected double cost;       // цена
    protected String character;  // характер
    protected LocalDate birthDate; // дата рождения

    public AbstractAnimal(String breed, String name, double cost, String character, LocalDate birthDate) {
        this.breed = breed;
        this.name = name;
        this.cost = cost;
        this.character = character;
        this.birthDate = birthDate;
    }

    @Override
    public String getBreed() {
        return breed;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String getCharacter() {
        return character;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        AbstractAnimal that = (AbstractAnimal) obj;

        return Double.compare(that.cost, cost) == 0 &&
                breed.equals(that.breed) &&
                name.equals(that.name) &&
                character.equals(that.character) &&
                birthDate.equals(that.birthDate);
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Breed: %s, Cost: %.2f, Character: %s, BirthDate: %s",
                name, breed, cost, character, birthDate);
    }
}

