package generics.library;

public class Newspaper {
  private String title;

  public Newspaper(String title) {
    this.title = title;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "Newspaper{" +
        "title='" + title + '\'' +
        '}';
  }
}
