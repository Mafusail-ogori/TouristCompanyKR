package command;

import data.TouristAttractionsData;

public class GenerateTicketsCommand implements Command{
    public GenerateTicketsCommand(TouristAttractionsData touristTickets) {
        this.touristTickets = touristTickets;
    }

    TouristAttractionsData touristTickets;

    @Override
    public void execute() {
        touristTickets.touristTicketGenerator();
    }
}
