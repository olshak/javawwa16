package lambdaexpressions.calculator;

public class Calculator {
  private double numberOfAccidents;
  private Calculation calculation;

  public Calculator(double numberOfAccidents, Calculation calculation) {
    this.numberOfAccidents = numberOfAccidents;
    this.calculation = calculation;
  }

  public double calculatePremium() {
    return calculation.calculate(numberOfAccidents);
  }

  public static void main(String[] args) {

    // before Java 8
    new Calculator(100, new Calculation() {
      @Override
      public double calculate(double a) {
        return a + 2;
      }
    });

    // Java 8
    new Calculator(100,
        (double a) ->
        {
          return a + 2;
        });

    // Java 8 simpler
    new Calculator(100,
        (double a) -> a + 2);

    // Java 8 simplest
    new Calculator(100, a -> a + 2);

    new Calculator(100, a -> a * 5);
  }
}
