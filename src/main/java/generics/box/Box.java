package generics.box;

public class Box <Type> {
  private Type content;

  public Box(Type content) {
    this.content = content;
  }

  public Type getContent() {
    return content;
  }

  public void setContent(Type content) {
    this.content = content;
  }

  public static void main(String[] args) {
    Box<Integer> intBox = new Box<Integer>(123);
    Box<Double> doubleBox = new Box<Double>(432.645);

    // kompilator informuje nas o bledzie
    // String s = intBox.getContent();


  }
}
