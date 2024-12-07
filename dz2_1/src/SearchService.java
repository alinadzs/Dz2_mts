import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Интерфейс для поиска животных.
 */
public interface SearchService {
    List<String> findLeapYearNames(List<AbstractAnimal> animals);
    List<AbstractAnimal> findOlderAnimal(List<AbstractAnimal> animals, int years);
    void findDuplicate(List<AbstractAnimal> animals);
}