class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
  private int distance = 0, numVictories = 0;

  public void drive() {
    distance += 10;
  }

  public int getDistanceTravelled() {
    return distance;
  }

  public int getNumberOfVictories() {
    return numVictories;
  }

  public void setNumberOfVictories(int numberOfVictories) {
    numVictories += numberOfVictories;
  }

  @Override
  public int compareTo(ProductionRemoteControlCar o) {
    return Integer.compare(o.getNumberOfVictories(), this.getNumberOfVictories());
  }
}
