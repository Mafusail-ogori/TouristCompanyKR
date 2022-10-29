package command;

import data.TouristAttractionsData;

public class SortByPriceCommand implements Command {
    TouristAttractionsData touristTickets;

    public SortByPriceCommand(TouristAttractionsData touristTickets) {
        this.touristTickets = touristTickets;
    }

    @Override
    public void execute() {
        touristTickets.sortByPrice();
    }
}
