package functionalinterface;

public class StringUtils {
  public static String betterString(String s1, String s2, BetterStringComparator betterStringComparator) {
//    if (betterStringCamparator.compare(s1, s2)) {
//      return s1;
//    } else {
//      return s2;
//    }
    return betterStringComparator.compare(s1, s2) ? s1 : s2;
  }
}
