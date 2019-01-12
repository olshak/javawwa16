package generics.library;

import java.util.ArrayList;
import java.util.List;

public class LibraryGeneric<T> {
  List<T> elements = new ArrayList<T>();

  public LibraryGeneric() {
  }

  public List<T> getElements() {
    return elements;
  }

  public void rentElement(T thing) {
    elements.remove(thing);
  }

  public void returnElement(T thing) {
    elements.add(thing);
  }

  public static void main(String[] args) {
    LibraryGeneric<Book> library = new LibraryGeneric<Book>();
    library.returnElement(new Book("book1"));
    library.returnElement(new Book("book2"));
    library.returnElement(new Book("book3"));

    // kompilator rzuca blad
    // library.returnElement(new Newspaper("book3"));

  }
}
