package lambdaexpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

  public static void main(String[] args) {
    List<String> books = new ArrayList<>();
    books.add("book1");
    books.add("book2");
    books.add("book3");
    books.add("book4");
    books.add("book5");
    for (int i = 0; i < books.size(); i++) {
      if (books.get(i).equals("book2")) {
        System.out.println("znalazlem");
      }
    }
    for (String book : books) {
      if (book.equals("book0")) {
        System.out.println("znalazlem");
      }
    }

    books.forEach( book -> {
      if (book.equals("book0")) {
        System.out.println("znalazlem");
      }
    });

    books.stream()
        .filter(book -> book.equals("book0"))
        .collect(Collectors.toList())
        .forEach(book -> System.out.println("znalazlem"));


    List<String> filtered = books.stream()
        .filter(book -> !book.equals("book3"))
        .filter(book -> !book.equals("book1"))
        .map(book -> book + "obczailem")
        .collect(Collectors.toList());

    List<Integer> integers = new ArrayList<>();
    integers.add(1);
    integers.add(2);
    integers.add(3);
    integers.add(4);
    integers.add(5);
    System.out.println(
        integers.stream()
            .reduce(0, (a, b) -> a + b)
    );

    System.out.println(
        integers.stream()
            .reduce(1, (a, b) -> a * b)
    );

    System.out.println(filtered);
  }
}
