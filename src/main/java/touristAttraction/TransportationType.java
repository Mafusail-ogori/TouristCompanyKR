package touristAttraction;

import java.util.Random;

public enum TransportationType {
    Car,
    Bus,
    Train,
    Plane,
    Ship,
    StarShip,
    Horse;
    public static TransportationType getRandomTransport(){
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
    public static TransportationType getSameTransport(String neededTransport){
        for (var transport: values()) {
            if(transport.toString().equalsIgnoreCase(neededTransport)){
                return transport;
            }
        }
        return null;
    }
}
