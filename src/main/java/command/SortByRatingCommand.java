package command;

import data.TouristAttractionsData;

public class SortByRatingCommand implements Command {

    TouristAttractionsData touristTickets;

    public SortByRatingCommand(TouristAttractionsData touristTickets) {
        this.touristTickets = touristTickets;
    }

    @Override
    public void execute() {
        touristTickets.sortByRating();
    }
}

