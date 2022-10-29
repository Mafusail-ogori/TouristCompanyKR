package touristAtraction;

import java.util.Random;

public enum TransportationType {
    Car,
    Bus,
    Train,
    Plane;
    public static TransportationType getRandomTransport(){
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
