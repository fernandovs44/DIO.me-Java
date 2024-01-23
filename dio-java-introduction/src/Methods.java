public class Methods {
  boolean on = false;
  int channel = 1;
  int volume = 1;

  public void turnOn() {
    on = true;
  }

  public void changeChannel() {
    channel = 15;
  }

  public void changeVolume() {
    volume = 25;
  }

  public void upChannel() {
    channel++;
  }

  public void downChannel() {
    channel--;
  }

  public void upVolume() {
    volume++;
  }

  public void downVolume() {
    volume--;
  }

  public static void main(String[] args) {

    Methods methods = new Methods();

    System.out.println("The Tv is: " + methods.on);
    System.out.println("The channel is: " + methods.channel);
    System.out.println("The volume is: " + methods.volume);

    methods.turnOn();
    System.out.println("The Tv is: " + methods.on);

    methods.changeChannel();
    System.out.println("The channel is: " + methods.channel);

    methods.changeVolume();
    System.out.println("The volume is: " + methods.volume);

    methods.upVolume();
    methods.upVolume();
    System.out.println("The volume is: " + methods.volume);

    methods.downChannel();
    methods.downChannel();
    System.out.println("The channel is: " + methods.channel);

  }
}
