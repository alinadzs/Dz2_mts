import java.time.LocalDate;

public class Dog extends Pet {
    public Dog(String name, double cost, String character, LocalDate birthDate) {
        super("Dog", name, cost, character, birthDate);
    }
}