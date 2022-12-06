package hmos9c.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class FilteringOperationTest {

  @Test
  void testFilter() {
    List.of("Sanas", "Febriyan", "hmos9c", "Akmal", "ardi").stream()
        .filter(name -> name.length() > 4)
        .forEach(System.out::println);

    List.of(1,2,3,4,5,6,7,8,9,10).stream()
        .filter(number -> number % 2 == 0)
        .forEach(System.out::println);
  }

  @Test
  void testDistinct() {
    List.of("Sanas", "Febriyan", "Sanas" , "hmos9c", "Akmal", "Ardi", "Akmal").stream()
        .distinct()
        .forEach(System.out::println);
  }
}
