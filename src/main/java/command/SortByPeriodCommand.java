package command;

import data.TouristAttractionsData;

public class SortByPeriodCommand implements Command{
    TouristAttractionsData touristTickets;

    public SortByPeriodCommand(TouristAttractionsData touristTickets) {
        this.touristTickets = touristTickets;
    }

    @Override
    public void execute() {
        touristTickets.sortByPeriod();
    }
}
