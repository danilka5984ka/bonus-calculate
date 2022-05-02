public class BonusService {
  public long calculate(int amount, boolean registered) {
    int percent = registered ? 3 : 1;
    int bonus = amount * percent / 100 / 100;
    if (bonus > 500) {
      bonus = 500;
    }
    return bonus;

  }
}


