package lambdaexpressions.library;

public class Book {
  private String title;
  private String author;
  private int price;
  private int releaseYear;

  public Book(String author, String title, int price, int releaseYear) {
    this.title = title;
    this.author = author;
    this.price = price;
    this.releaseYear = releaseYear;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getReleaseYear() {
    return releaseYear;
  }

  public void setReleaseYear(int releaseYear) {
    this.releaseYear = releaseYear;
  }

  @Override
  public String toString() {
    return "Book{" +
        "title='" + title + '\'' +
        ", author='" + author + '\'' +
        ", price=" + price +
        ", releaseYear='" + releaseYear + '\'' +
        '}';
  }
}
