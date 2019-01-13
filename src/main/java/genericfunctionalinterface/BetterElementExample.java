package genericfunctionalinterface;

import generics.library.Book;

public class BetterElementExample {
  public static void main(String[] args) {
    String string1 = "asdadseggrthrt";
    String string2 = "asddas";
    String longer = ElementUtils.betterElement(string1, string2,
        (s1, s2) -> s1.length() > s2.length());

    Book book1 = new Book("dsaa");
    Book book2 = new Book("asd");
    Book betterBook = ElementUtils.betterElement(book1, book2,
        (b1, b2) -> b1.getTitle().length() > b2.getTitle().length());

    System.out.println(longer);
    System.out.println(betterBook);
  }
}
