package command;

import data.TouristAttractionsData;

public class QuizCommand implements Command{
    TouristAttractionsData touristTickets;

    public QuizCommand(TouristAttractionsData touristTickets) {
        this.touristTickets = touristTickets;
    }

    @Override
    public void execute() {
        touristTickets.quiz();
    }
}
