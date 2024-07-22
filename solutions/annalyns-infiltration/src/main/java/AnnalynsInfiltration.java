class AnnalynsInfiltration {

  boolean knightIsAwake = false;
  boolean archerIsAwake = true;
  boolean prisonerIsAwake = false;
  boolean petDogIsPresent = false;

  public static boolean canFastAttack(boolean knightIsAwake) {
    if (knightIsAwake) {
      return false;
    }
    return true;
  }

  public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
    if (knightIsAwake || archerIsAwake || prisonerIsAwake) {
      return true;
    }

    return false;
  }

  public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
    if (prisonerIsAwake && !archerIsAwake) {
      return true;
    }
    return false;
  }

  public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake,
      boolean petDogIsPresent) {
    if (petDogIsPresent && !archerIsAwake) {
      return true;
    }

    if (!petDogIsPresent && prisonerIsAwake && !knightIsAwake && !archerIsAwake) {
      return true;
    }

    return false;
  }
}
