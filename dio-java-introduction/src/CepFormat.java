public class CepFormat {

  public static void main(String[] args) {
    try {
      String cep = formatCep("23765066");
    } catch (CepInvalid e) {
      // TODO Auto-generated catch block
      System.out.println("Must be 8 numbers");
    }
  }

  static String formatCep(String cep) throws CepInvalid {
    if (cep.length() != 8)
      throw new CepInvalid();

    return "23.765-064";
  }
}
