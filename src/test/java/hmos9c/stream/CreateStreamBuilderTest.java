package hmos9c.stream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class CreateStreamBuilderTest {

  @Test
  void testCreateStreamBuilder() {

    Stream.Builder<String> builder = Stream.builder();
    builder.accept("Sanas");
    builder.add("Febriyan").add("hmso9c");

    Stream<String> stream = builder.build();
    stream.forEach(System.out::println);

  }

  @Test
  void testCreateStreamBuilderSimplify() {
    Stream<Object> stream = Stream.builder()
        .add("Sanas").add("Febriyan").add("hmos9c").build();

    stream.forEach(System.out::println);
  }
}
