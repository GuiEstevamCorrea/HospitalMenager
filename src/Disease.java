import java.util.Random;

public enum Disease {
    UNKNOWN,
    COVID,
    FLU,
    COLD,
    TUBERCULOSE;

    public static Disease getRandomDisease(){
        return values()[new Random().nextInt(values().length)];
    }
}
