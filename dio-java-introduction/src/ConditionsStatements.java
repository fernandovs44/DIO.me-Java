public class ConditionsStatements {

  public static void main(String[] args) {
    // if Statement

    double balanceAccount1 = 50.00;
    double withdrawal1 = 30.00;

    if (balanceAccount1 > withdrawal1) {

      balanceAccount1 = balanceAccount1 - withdrawal1;
      System.out.println(balanceAccount1);

    }

    // if else statement

    double balanceAccount2 = 50.00;
    double withdrawal2 = 60.00;

    if (balanceAccount2 > withdrawal2) {

      balanceAccount2 = balanceAccount2 - withdrawal2;
      System.out.println(balanceAccount2);

    } else {
      System.out.println("No funds");
    }

    // if else if statement

    double balanceAccount3 = 10.00;
    double withdrawal3 = 30.00;

    if (balanceAccount3 > withdrawal3) {

      balanceAccount3 = balanceAccount3 - withdrawal3;
      System.out.println(balanceAccount3);

    } else if (withdrawal3 == 30.00) {

      System.out.println("No $30.00 bill");

    } else {
      System.out.println("No funds");
    }

    // Switch Case
    int day = 8;
    switch (day) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
      default:
        System.out.println("Error");
    }
  }

}
