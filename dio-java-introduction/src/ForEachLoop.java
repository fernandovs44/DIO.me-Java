public class ForEachLoop {

  public static void main(String[] args) {

    String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };

    for (String i : cars) {
      System.out.println(i);
    }

    for (int numero = 1; numero <= 5; numero++) {
      if (numero == 3)
        break;

      System.out.println(numero);

    }

    for (int numero = 1; numero <= 5; numero++) {
      if (numero == 3)
        continue;

      System.out.println(numero);

    }
  }

}
