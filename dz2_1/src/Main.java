import java.util.List;

public class Main {
    public static void main(String[] args) {
        CreateAnimalServiceImpl animalService = new CreateAnimalServiceImpl();

        // Создание 10 животных с помощью while
        List<AbstractAnimal> animalsDefault = animalService.createDefaultAnimals();
        animalsDefault.forEach(System.out::println);

        // Создание N животных с помощью for (с Dog и Shark)
        List<AbstractAnimal> animalsFor = animalService.createAnimals(6);
        animalsFor.forEach(System.out::println);

        // Создание N животных с помощью do-while (с Wolf и Shark)
        List<AbstractAnimal> animalsDoWhile = animalService.createAnimalsDoWhile(4);
        animalsDoWhile.forEach(System.out::println);
    }
}
