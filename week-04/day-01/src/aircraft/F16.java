package aircraft;

public class F16 extends Aircrafts {

  public F16() {
    super("F16", 8, 30, 0);
  }

  public boolean isPriority(){
    return false;
  }
}
