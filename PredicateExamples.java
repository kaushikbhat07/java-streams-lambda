import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExamples {
    public static void main(String[] args) {
        // Predicate is a functional interface and can therefore be used as the assignment target for a lambda expression or method reference.

        // 2. Creating a Predicate
        Predicate<Employee> isAdult = employee -> employee.age() > 18;

        Predicate<Employee> isFemale = employee -> employee.gender().equalsIgnoreCase("F");

        Predicate<Employee> isAdultFemale = isAdult.and(isFemale);

        Predicate<Employee> isAdultMale = isAdult.and(isFemale.negate());

        // 3. Using Predicate with Streams
        List<Employee> numbersList = new ArrayList<>();

        numbersList.stream().filter(isAdult);
    }
}
