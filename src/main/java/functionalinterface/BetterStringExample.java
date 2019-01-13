package functionalinterface;

public class BetterStringExample {
  public static void main(String[] args) {
    String string1 = "asdadseggrthrt";
    String string2 = "asddas";
    String longer = StringUtils.betterString(string1, string2,
        (s1, s2) -> s1.length() > s2.length());
    String alwaysFirst = StringUtils.betterString(string1, string2,
        (s1, s2) -> true);
    String alwaysSecond = StringUtils.betterString(string1, string2,
        (s1, s2) -> false);
    String compareFirstChar = StringUtils.betterString(string1, string2,
        (s1, s2) -> s1.charAt(0) < s2.charAt(0));
    System.out.println(longer);
    System.out.println(alwaysFirst);
    System.out.println(alwaysSecond);
    System.out.println(compareFirstChar);
  }
}
