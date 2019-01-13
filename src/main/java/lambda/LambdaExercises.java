package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LambdaExercises {
  public static List<String> getUppercase(List<String> l) {
    List<String> upperCase = new ArrayList<>();
    for (String s : l) {
      upperCase.add(s.toUpperCase());
    }
    return upperCase;
  }

  public static List<String> getUppercaseLambda(List<String> l) {
    return l.stream()
        .map(String::toUpperCase)
        .collect(Collectors.toList());
  }

  public static List<String> getStartingWithSAndLength4(List<String> l) {
    return l.stream()
        .filter(s -> s.charAt(0) == 's' || s.charAt(0) == 'S')
        .filter(s -> s.length() == 4)
        .collect(Collectors.toList());
  }

  public static String getString(List<Integer> list) {
    Optional<String> maybeString = list
        .stream()
        .map(number -> {
          if (number % 2 == 0) {
            return "p" + number;
          } else {
            return "n" + number;
          }
        }).reduce(
        (s1, s2) -> s1 + ", " + s2
        );

//    if (maybeString.isPresent()) {
//      return maybeString.get();
//    } else {
//      return "";
//    }

    // return maybeString.isPresent() ? maybeString.get() : "";
    return maybeString.orElse("");
  }

  public static Double average(List<Integer> list) {
    // return (double)list.stream().reduce(0, (a, b) ->a+b)/list.size();
    return list.stream().mapToDouble(a -> a).average().orElse(0);
  }

  public static List<String> sort(List<String> l) {
    return l.stream()
        // .sorted()
        .sorted((s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase()))
        .collect(Collectors.toList());
  }

  public static List<String> sortReverseOrder(List<String> l) {
    return l.stream()
         .sorted((s1, s2) -> s2.toUpperCase().compareTo(s1.toUpperCase()))
        .collect(Collectors.toList());
  }

  public static List<String> sortAccordingToFirstChar(List<String> l) {
    return l.stream()
        .sorted((s1, s2) -> {
          if (s1.toUpperCase().charAt(0) < s2.toUpperCase().charAt(0)) {
            return -1;
          } else if (s1.toUpperCase().charAt(0) > s2.toUpperCase().charAt(0)) {
            return 1;
          } else {
            return 0;
          }
        })
        .collect(Collectors.toList());
  }

  public static List<String> sortAccordingToFirstCharIsE(List<String> l) {
    return l.stream()
        .sorted((s1, s2) -> {
          if (s1.toUpperCase().charAt(0) == 'E' && s2.toUpperCase().charAt(0) != 'E') {
            return -1;
          } else if (s1.toUpperCase().charAt(0) != 'E' && s2.toUpperCase().charAt(0) == 'E') {
            return -1;
          } {
            return 0;
          }
        })
        .collect(Collectors.toList());
  }

  public static void main(String[] args) {
    List<String> stringList = new ArrayList<>();
    stringList.add("Esda");
    stringList.add("asda");
    stringList.add("esda");
    stringList.add("aaaada");
    stringList.add("Efdasda");
    stringList.add("grasda");
    stringList.add("Grasda");
    stringList.add("eetasda");
    stringList.add("Wetasda");
    stringList.add("sert");
    System.out.println(stringList);
    System.out.println(
        LambdaExercises.getUppercaseLambda(stringList)
    );
    System.out.println(
        LambdaExercises.getStartingWithSAndLength4(stringList)
    );

    List<Integer> integerList = new ArrayList<>();
    integerList.add(123);
    integerList.add(55);
    integerList.add(2);
    integerList.add(1);
    integerList.add(3);
    System.out.println(LambdaExercises.getString(integerList));
    System.out.println(LambdaExercises.sort(stringList));
    System.out.println(LambdaExercises.sortReverseOrder(stringList));
    System.out.println(LambdaExercises.sortAccordingToFirstChar(stringList));
    System.out.println(LambdaExercises.sortAccordingToFirstCharIsE(stringList));
  }
}
