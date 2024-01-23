public class MethodSmatTv {
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
}
