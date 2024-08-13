class Fighter {

  boolean isVulnerable() {
    return true;
  }

  int getDamagePoints(Fighter fighter) {
    return fighter.getDamagePoints(fighter);
  }
}