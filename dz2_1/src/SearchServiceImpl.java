import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
/**
 * Реализация SearchService.
 */
public class SearchServiceImpl implements SearchService {

    @Override
    public List<String> findLeapYearNames(List<AbstractAnimal> animals) {
        return animals.stream()
                .filter(a -> Year.isLeap(a.getBirthDate().getYear()))
                .map(AbstractAnimal::getName)
                .collect(Collectors.toList());
    }

    @Override
    public List<AbstractAnimal> findOlderAnimal(List<AbstractAnimal> animals, int years) {
        LocalDate currentDate = LocalDate.now();
        return animals.stream()
                .filter(a -> currentDate.minusYears(years).isAfter(a.getBirthDate()))
                .collect(Collectors.toList());
    }

    @Override
    public void findDuplicate(List<AbstractAnimal> animals) {
        animals.stream()
                .collect(Collectors.groupingBy(a -> a, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .forEach(e -> System.out.println("Дубликат: " + e.getKey()));
    }
}
