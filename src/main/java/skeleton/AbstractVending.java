package skeleton;

public abstract class AbstractVending implements Ivending {

  @Override
  public void start()
  {
    System.out.println("Start Vending machine");
  }
  @Override
  public void stop()
  {
    System.out.println("Stop Vending machine");
  }
  @Override
  public void process()
  {
    start();
    chooseProduct();
    stop();
  }
}
