package hmos9c.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class OrderingOperationTest {

  @Test
  void testSorted() {
    List.of("Sanas", "Febriyan", "hmos9c", "Programmer", "Java", "Stream").stream()
        .sorted()
        .forEach(System.out::println);
  }

  @Test
  void testSortedWithComparator() {
    Comparator<String> reverseComparator = Comparator.reverseOrder();

    List.of("Sanas", "Febriyan", "hmos9c", "Programmer", "Java", "Stream").stream()
        .sorted(reverseComparator)
        .forEach(System.out::println);
  }
}
