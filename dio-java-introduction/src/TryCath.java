import java.util.Scanner;
import java.util.Locale;

public class TryCath {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Type your name");
    String name = scanner.next();

    System.out.println("Type your last name");
    String LastName = scanner.next();

    System.out.println("Type your age");
    String age = scanner.next();

    System.out.println("Type your height");
    String height = scanner.next();

    System.out
        .println(
            "My name is " + name + " " + LastName + ". I'm " + age + " years old and my height is " + height + ".");

  }
}
