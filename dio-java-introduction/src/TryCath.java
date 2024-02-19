import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class TryCath {

  public static void main(String[] args) {
    try {
      Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

      System.out.println("Type your name");
      String name = scanner.next();

      System.out.println("Type your last name");
      String LastName = scanner.next();

      System.out.println("Type your age");
      Integer age = scanner.nextInt();

      System.out.println("Type your height");
      Double height = scanner.nextDouble();

      System.out
          .println(
              "My name is " + name + " " + LastName + ". I'm " + age + " years old and my height is " + height + ".");

    } catch (InputMismatchException e) {
      System.err.println("Age and Height fields must be numeric");
    }
  }
}
