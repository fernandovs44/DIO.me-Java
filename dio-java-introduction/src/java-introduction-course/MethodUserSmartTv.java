public class MethodUserSmartTv {
  public static void main(String[] args) {

    MethodSmatTv methodsmatTv = new MethodSmatTv();

    System.out.println("The Tv is: " + methodsmatTv.on);
    System.out.println("The channel is: " + methodsmatTv.channel);
    System.out.println("The volume is: " + methodsmatTv.volume);

    methodsmatTv.turnOn();
    System.out.println("The Tv is: " + methodsmatTv.on);

    methodsmatTv.changeChannel();
    System.out.println("The channel is: " + methodsmatTv.channel);

    methodsmatTv.changeVolume();
    System.out.println("The volume is: " + methodsmatTv.volume);

    methodsmatTv.upVolume();
    methodsmatTv.upVolume();
    System.out.println("The volume is: " + methodsmatTv.volume);

    methodsmatTv.downChannel();
    methodsmatTv.downChannel();
    System.out.println("The channel is: " + methodsmatTv.channel);

  }

}
