package touristAttraction;

import java.util.Random;


public enum TouristTicketTitle {
    AzurePassion,
    GreatSunrise,
    ArrogantFruit,
    NatureBeauty,
    MoonlightShine,
    ProminentTime;

    public static TouristTicketTitle getRandomTitle() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
    public static TouristTicketTitle getSameTicketTitle(String neededTitle){
        for (var title: values()) {
            if(title.toString().equalsIgnoreCase(neededTitle)){
                return title;
            }
        }
        return null;
    }
}
