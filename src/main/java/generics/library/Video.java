package generics.library;

public class Video {
  private String title;

  public Video(String title) {
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
    return "Video{" +
        "title='" + title + '\'' +
        '}';
  }
}
