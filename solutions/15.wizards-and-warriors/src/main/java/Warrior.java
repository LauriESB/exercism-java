public class Warrior extends Fighter {
  
  @Override
  public boolean isVulnerable() {
    return false;
  }

  public int getDamagePoints(Fighter f) {
    return f.isVulnerable() ? 10 : 6;
  }

  public String toString() {
    return "Fighter is a Warrior";
  }
}
