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


}
