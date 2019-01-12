package generics.pair;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pair<Sth>
{
  public Pair(Sth firstElement, Sth secondElement)
  {
    if (firstElement == null) {
      throw new IllegalArgumentException("First argument is null");
    }
    if (secondElement == null ) {
      throw new IllegalArgumentException("Second argument is null");
    }
    first = firstElement;
    second = secondElement;
  }
  private Sth first;
  private Sth second;
  public Sth getFirst() { return first; }
  public Sth getSecond() { return second; }

  @Override
  public String toString() {
    return "Pair{" +
        "first=" + first +
        ", second=" + second +
        '}';
  }

  public void swap() {
    Sth temp = first;
    first = second;
    second = temp;
  }

  public static <Sth2> void staticSwap(Pair<Sth2> pair) {
    pair.swap();
  }

  public static <Sth3 extends Comparable<? super Sth3>> Pair<Sth3> minMax(List<Sth3> list) {
    Sth3 first = Collections.min(list);
    Sth3 second = Collections.max(list);
    return new Pair<>(first, second);
  }


  public static void main(String[] args) {
    Pair<String> p1 = new Pair<>("kot", "pies");
//    Pair<String> p2 = new Pair<>("", null);

    System.out.println(p1);
    p1.swap();
    System.out.println(p1);
    Pair.staticSwap(p1);
    System.out.println(p1);

    List<Integer> minMaxList = new ArrayList<>();
    minMaxList.add(2);
    minMaxList.add(-1);
    minMaxList.add(1);
    minMaxList.add(0);
    System.out.println(minMax(minMaxList));
  }
}