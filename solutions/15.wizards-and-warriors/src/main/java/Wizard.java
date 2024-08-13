public class Wizard extends Fighter {
  private boolean advance;

  public Wizard() {
    this.advance = false;
  }

  public boolean prepareSpell() {
    advance = true;
    return advance;
  }

  public boolean isVulnerable() {
    return advance ? false : true;
  }
  
  public int getDamagePoints(Fighter f) {
    return isVulnerable() ? 3 : 12;
  }

  public String toString() {
    return "Fighter is a Wizard";
  }
  
}
