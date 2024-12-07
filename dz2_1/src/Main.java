import java.util.List;

public class Main {
    public static void main(String[] args) {
        CreateAnimalServiceImpl createService = new CreateAnimalServiceImpl();
        SearchServiceImpl searchService = new SearchServiceImpl();

        // Создание 10 животных
        List<AbstractAnimal> animals = createService.createAnimals();
        animals.forEach(System.out::println);

        // Поиск имен животных, рожденных в високосный год
        List<String> leapYearNames = searchService.findLeapYearNames(animals);
        System.out.println("Животные, рожденные в високосный год: " + leapYearNames);

        // Поиск животных старше 5 лет
        List<AbstractAnimal> olderAnimals = searchService.findOlderAnimal(animals, 5);
        System.out.println("Животные старше 5 лет: " + olderAnimals);

        // Поиск дубликатов
        searchService.findDuplicate(animals);
    }
}
