import java.util.concurrent.ThreadLocalRandom;

public class SelectiveProcess {

  public static void main(String[] args) {
    String[] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA", "DANIELA",
        "JORGE" };

  }

  static double valorPretendido() {
    return ThreadLocalRandom.current().nextDouble(1800, 2200);
  }

  static void SelectCandidateSalary(double baseSalary, double pretendSalary) {
    if (baseSalary > pretendSalary) {
      System.out.println("Call candidate");
    } else if (baseSalary == pretendSalary) {
      System.out.println("Call candidate with a counter proposal");
    } else {
      System.out.println("Waiting for results from other candidates");
    }

  }
}
