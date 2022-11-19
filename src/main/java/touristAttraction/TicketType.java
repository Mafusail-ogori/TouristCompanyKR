package touristAttraction;

import java.util.Random;
public enum TicketType {
    Resort,
    Excursion,
    Healing,
    Shopping,
    Cruise;
    public static TicketType getTicketType() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
    public static TicketType getSameTicketType(String neededType){
        for (var type: values()) {
            if(type.toString().equalsIgnoreCase(neededType)){
                return type;
            }
        }
        return null;
    }
}