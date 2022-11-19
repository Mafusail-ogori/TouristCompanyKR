package data;

import touristAttraction.TicketType;
import touristAttraction.TouristTicket;
import touristAttraction.TouristTicketTitle;
import touristAttraction.TransportationType;

import java.util.*;

import static graphicsText.Graphics.*;

public class TouristAttractionsData {

    public List<TouristTicket> getTouristTickets() {
        return touristTickets;
    }

    List<TouristTicket> touristTickets = new ArrayList<>();


    public static void touristTicketGenerator() {
        Random random = new Random();
        for (var i = 0; i < 4000; i++) {
            new TouristAttractionDataBase().addToDataBase(TouristTicketTitle.getRandomTitle().toString(), random.nextInt(3, 28),
                    random.nextInt(1, 11), String.valueOf(random.nextBoolean()),
                    String.valueOf(random.nextBoolean()), String.valueOf(random.nextBoolean()), String.valueOf(random.nextBoolean()), TicketType.getTicketType().toString(),
                    random.nextDouble(250.5, 12000), random.nextInt(1, 6), TransportationType.getRandomTransport().toString());
        }
    }

    public void showAll() {
        System.out.println(allPorposalsText);
        new TouristAttractionDataBase().getFromDataBase(touristTickets);
        System.out.println(upperBound);
        for (var ticket : this.touristTickets) {
            System.out.println(ticket);
        }
        System.out.println(lowerBound);
    }

    public boolean isSame(String choice, boolean real) {
        return  choice.equalsIgnoreCase("yes") == real;
    }

    public boolean isSameTransport(String choice, TransportationType transportationType){
        return choice.equalsIgnoreCase(transportationType.toString());
    }
    public StringBuilder questioner() {
        StringBuilder answers = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.println(quizText);
        System.out.print("How much people there is in your group >> ");
        answers.append(scanner.next()).append(" ");
        System.out.print("Do you have any child >> ");
        answers.append(scanner.next()).append(" ");
        System.out.print("Do you have aby animal >> ");
        answers.append(scanner.next()).append(" ");
        System.out.print("Do you need noise reduction >> ");
        answers.append(scanner.next()).append(" ");
        System.out.print("Do you need a party programme >> ");
        answers.append(scanner.next()).append(" ");
        System.out.print("Which transport do you prefer >> ");
        answers.append(scanner.next());
        return answers;
    }

    public void sortByPrice() {
        touristTickets.sort(Comparator.comparingInt(TouristTicket::getPrice));
    }

    public void sortByRating() {
        touristTickets.sort(Comparator.comparingInt(TouristTicket::getHotelRating));
    }

    public void sortByPeriod() {
        touristTickets.sort(Comparator.comparingInt(TouristTicket::getPeriod));
    }

    public void quiz() {
        var answers = questioner().toString().split(" ");
        System.out.println(filteredTicketsText);
        System.out.println(upperBound);
        for (var ticket : touristTickets) {
            if (Integer.parseInt(answers[0]) == ticket.getPeopleAmount() &&
                    isSame(answers[1], ticket.isHasChild()) &&
                    isSame(answers[2], ticket.isHasAnimal()) &&
                    isSame(answers[3], ticket.isNeedNoiseReduction()) &&
                    isSame(answers[4], ticket.isIncludesParty()) &&
                    isSameTransport(answers[5], ticket.getTransportationType())
            ) {
                System.out.println(ticket);
            }
        }
        System.out.println(lowerBound);
    }
}