package command;

import data.TouristAttractionsData;

public class ShowAllPorposalsCommand implements Command {
    public ShowAllPorposalsCommand(TouristAttractionsData tickets) {
        this.tickets = tickets;
    }

    TouristAttractionsData tickets;

    @Override
    public void execute() {
        tickets.showAll();
    }
}
