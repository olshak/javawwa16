package lambdaexpressions.library;

import generics.pair.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {
  private List<Book> books;

  public LambdaLibrary(List<Book> books) {
    if (books == null || books.isEmpty()) {
      throw new IllegalArgumentException("Books can not be null");
    }
    this.books = books;
  }

  private List<String> getAuthors() {
    return books.stream()
        .map(Book::getAuthor)
        .collect(Collectors.toList());
  }

  private List<String> getTitles() {
    return books.stream()
        .map(Book::getTitle)
        .collect(Collectors.toList());
  }

  private List<Integer> getPrices() {
    return books.stream()
        .map(Book::getPrice)
        .collect(Collectors.toList());
  }

  private List<Book> getBooksByAuthor(String author) {
    return books.stream()
        .filter(book -> book.getAuthor().equals(author))
        .collect(Collectors.toList());
  }

  private List<Book> getBooksByTitle(String title) {
    return books.stream()
        .filter(book -> book.getTitle().equals(title))
        .collect(Collectors.toList());
  }

  private List<Book> getBooksByPrice(int price) {
    return books.stream()
        .filter(book -> book.getPrice() == price)
        .collect(Collectors.toList());
  }

  private List<Book> getBooksByYear(int year) {
    return books.stream()
        .filter(book -> book.getReleaseYear() == year)
        .collect(Collectors.toList());
  }

  private int getPricesSum() {
    return books.stream()
        .map(Book::getPrice)
        .reduce(0, (b1, b2) -> b1 + b2);
  }

  private List<Book> getBooksForPriceRange(Pair<Integer> priceRange) {
    return books.stream()
        //.filter(book -> book.getPrice() > priceRange.getFirst() && book.getPrice() < priceRange.getSecond())
        .filter(book -> book.getPrice() > priceRange.getFirst())
        .filter(book -> book.getPrice() < priceRange.getSecond())
        .collect(Collectors.toList());
  }

  private String getFormattedAuthors() {
    return books.stream()
        .map(Book::getAuthor)
        .reduce("", (a1, a2) -> a1 + "-" + a2 + "\n");
  }

  public int getPriceForAuthorAndTitle(String author, String title) {
    return books.stream()
        .filter(book -> book.getTitle().equals(title))
        .filter(book -> book.getAuthor().equals(author))
        .map(Book::getPrice)
        .reduce(0, (sum, price) -> sum + price);
  }


  public static void main(String[] args) {
    List<Book> books = new ArrayList<Book>();
    books.add(new Book(
        "Henryk Sienkiewicz", "Potop",
        50, 1886));
    books.add(new Book(
        "Henryk Sienkiewicz", "Quo Vadis",
        40,1895));
    books.add(new Book(
        "Henryk Sienkiewicz",
        "Krzyzacy",
        45,1900));
    books.add(new Book(
        "Adam Mickiewicz","Pan Tadeusz",
        65,1834));
    books.add(new Book(
        "Adam Mickiewicz","Konrad Wallenrod",
        30,1828));
    books.add(new Book(
        "Adam Mickiewicz","Sonety Krymskie",
        25,1826));
    books.add(new Book(
        "Stefan Zeromski","Przedwiosnie",
        29,1924));
    books.add(new Book(
        "Stefan Zeromski","Ludzie Bezdomni",
        39,1900));
    books.add(new Book(
        "Stefan Zeromski","Popioly",
        49,1902));

    LambdaLibrary library = new LambdaLibrary(books);

    System.out.println(library.getAuthors());
    System.out.println(library.getTitles());
    System.out.println(library.getPrices());
    System.out.println(library.getBooksByAuthor("Stefan Zeromski"));
    System.out.println(library.getPricesSum());
    System.out.println(
        library.getBooksForPriceRange(new Pair<>(40, 60)));
    System.out.println(library.getFormattedAuthors());
  }


}
