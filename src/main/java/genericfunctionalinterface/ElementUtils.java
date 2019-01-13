package genericfunctionalinterface;

public class ElementUtils {

  public static <T> T betterElement(T s1, T s2, BetterElementComparator<T> betterElementComparator) {
    return betterElementComparator.compare(s1, s2) ? s1 : s2;
  }
}
