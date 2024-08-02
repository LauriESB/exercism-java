class NeedForSpeed {
  private int speed;
  private int batteryDrain;
  private int finalBattery;
  private int metersDriven;

  NeedForSpeed(int speed, int batteryDrain) {
    this.speed = speed;
    this.batteryDrain = batteryDrain;
    finalBattery = 100;
    metersDriven = 0;
  }

  public boolean batteryDrained() {
    return finalBattery - batteryDrain  < 0 || finalBattery == 0;
  }

  public int distanceDriven() {
    return metersDriven;
  }

  public void drive() {
    if(!batteryDrained()) {
      metersDriven += speed;
      finalBattery -= batteryDrain;
    } 
  }

  public static NeedForSpeed nitro() {
    return new NeedForSpeed(50, 4);
  }
}

class RaceTrack {
  private int distance;
  RaceTrack(int distance) {
      this.distance = distance;
  }

  public boolean canFinishRace(NeedForSpeed car) {
    while(!car.batteryDrained()) {
      car.drive();
    }
    return car.distanceDriven() >= distance;
  }
}
