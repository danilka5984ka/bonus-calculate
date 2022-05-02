public class Main {
  public static void main(String[] args) {
    BonusService service = new BonusService();

    int amount = 1000;
    boolean registered = true;

    service.calculate (amount, registered);

  }
}

