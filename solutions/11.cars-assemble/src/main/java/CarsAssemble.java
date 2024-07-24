public class CarsAssemble {

  public double productionRatePerHour(int speed) {
    double rate = speed * 221;

    if (speed >= 1 && speed <= 4) {
      return rate;
    } else if (speed > 4 && speed <= 8) {
      rate = rate * 0.9;
    } else if (speed == 9) {
      rate = rate * 0.8;
    } else {
      rate = rate * 0.77;
    }
    return rate;
  }

  public int workingItemsPerMinute(int speed) {
    int value = (int) productionRatePerHour(speed) / 60;
    return value;
  }
}
