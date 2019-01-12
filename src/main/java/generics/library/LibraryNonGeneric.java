package generics.library;

import java.util.ArrayList;
import java.util.List;

public class LibraryNonGeneric {
  private List<Book> books = new ArrayList<Book>();
  private List<Newspaper> newspapers = new ArrayList<Newspaper>();
  private List<Video> videos = new ArrayList<Video>();

  public LibraryNonGeneric(List<Book> books, List<Newspaper> newspapers, List<Video> videos) {
    this.books = books;
    this.newspapers = newspapers;
    this.videos = videos;
  }

  public LibraryNonGeneric() {
  }

  public void rentBook(Book book) {
    books.remove(book);
  }

  public void returnBook(Book book) {
    books.add(book);
  }

  public void rentNewspaper(Newspaper newspaper) {
    newspapers.remove(newspaper);
  }

  public void returnNewspaper(Newspaper newspaper) {
    newspapers.add(newspaper);
  }

  public void rentVideo(Video video) {
    videos.remove(video);
  }

  public void returnVideo(Video video) {
    videos.add(video);
  }

  public List<Book> getBooks() {
    return books;
  }

  public List<Newspaper> getNewspapers() {
    return newspapers;
  }

  public List<Video> getVideos() {
    return videos;
  }

  public static void main(String[] args) {
    LibraryNonGeneric library = new LibraryNonGeneric();
    Book b = new Book("book0");
    library.returnBook(b);
    library.returnBook(new Book("book1"));
    library.returnBook(new Book("book2"));
    library.returnBook(new Book("book3"));
    library.returnNewspaper(new Newspaper("newspaper3"));
    library.returnVideo(new Video("video3"));
    System.out.println(library.getBooks());
    System.out.println(library.getNewspapers());
    System.out.println(library.getVideos());
    library.rentBook(b);
    System.out.println(library.getBooks());

  }
}
