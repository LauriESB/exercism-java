public class Lasagna {
   
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int minutes) {
        return expectedMinutesInOven() - minutes;
    }

    public int preparationTimeInMinutes(int layers) {
        return 2 * layers;
    }

    public int totalTimeInMinutes(int layers, int ovenTime){
        return preparationTimeInMinutes(layers) + ovenTime;
    }
}
