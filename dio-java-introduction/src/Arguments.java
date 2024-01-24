import java.util.Locale;
import java.util.Scanner;

public class Arguments {
  public static void main(String[] args) {
    System.out.println("Hello world");

    /*
     * String name = args[0];
     * String lastname = args[1];
     * int age = Integer.valueOf(args[2]);
     * double height = Double.valueOf(args[3]);
     * 
     * System.out.println("My name is: " + name);
     * System.out.println("My last name is: " + lastname);
     * System.out.println("My age is: " + age);
     * System.out.println("My height is: " + height);
     */

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Type your name");
    String name = scanner.next();
    System.out.println("Type your lastname");
    String lastname = scanner.next();
    System.out.println("Type your age");
    int age = scanner.nextInt();
    System.out.println("Type your height");
    double height = scanner.nextDouble();

    System.out.println("My name is: " + name);
    System.out.println("My last name is: " + lastname);
    System.out.println("My age is: " + age);
    System.out.println("My height is: " + height);
  }

}
