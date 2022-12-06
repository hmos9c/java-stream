package hmos9c.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class RetrievingOperationTest {

  @Test
  void testLimit() {
    List.of("Sanas", "Febriyan", "hmos9c", "Akmal", "Ardi").stream()
        .limit(2)
        .forEach(System.out::println);
  }

  @Test
  void testSkip() {
    List.of("Sanas", "Febriyan", "hmos9c", "Akmal", "Ardi").stream()
        .skip(2)
        .forEach(System.out::println);
  }

  @Test
  void testTakeWhile() {
    List.of("Sanas", "Samas", "Febriyan", "hmos9c", "Akmal", "Ardi").stream()
        .takeWhile(name -> name.length() <= 4)
        .forEach(System.out::println);
  }

  @Test
  void testDropWhile() {
    List.of("Sanas", "Samas", "Febriyan", "hmos9c", "Akmal", "Ardi").stream()
        .dropWhile(name -> name.length() <= 4)
        .forEach(System.out::println);
  }

  @Test
  void testFindAny() {
    Optional<String> optional = List.of("Sanas", "Samas", "Febriyan", "hmos9c", "Akmal", "Ardi").stream()
        .findAny();

    optional.ifPresent(name -> {
      System.out.println(name);
    });
  }

  @Test
  void testFindFirst() {
    Optional<String> optional = List.of("Sanas", "Samas", "Febriyan", "hmos9c", "Akmal", "Ardi").stream()
        .findFirst();

    optional.ifPresent(name -> {
      System.out.println(name);
    });
  }
}
