import java.util.Locale;
import java.util.Scanner;

public class BankAccount {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Type your account!");
    int account = scanner.nextInt();
    System.out.println("Type your bank agency!");
    String agency = scanner.next();
    System.out.println("Type your name!");
    String name = scanner.next();
    System.out.println("Type your balance!");
    double balance = scanner.nextDouble();

    System.out
        .println("Hello " + name + ", thank you for creating an account with our bank, your bank agency is " + agency
            + ", account number " + account + " and your balance $" + balance + " is now available for withdrawal.");

  }

}
