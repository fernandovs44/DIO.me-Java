import java.text.NumberFormat;
import java.text.ParseException;

public class ExceptionClass {

  public static void main(String[] args) {
    Number value = Double.valueOf("1.75");

    try {
      value = NumberFormat.getInstance().parse("a1.75");
      System.out.println(value);
    } catch (ParseException e) {
      System.out.println("Only number allowed");
    }

  }

}
