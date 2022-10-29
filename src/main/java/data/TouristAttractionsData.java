package data;

import touristAtraction.TicketType;
import touristAtraction.TouristTicket;
import touristAtraction.TouristTicketTitle;
import touristAtraction.TransportationType;

import java.util.*;

import static graphicsText.Graphics.*;

public class TouristAttractionsData {

    List<TouristTicket> touristTickets = new ArrayList<>();


    public void touristTicketGenerator() {
        Random random = new Random();
        for (var i = 0; i < 4000; i++) {
            this.touristTickets.add(new TouristTicket(TouristTicketTitle.getRandomTitle(), random.nextInt(3, 28),
                    random.nextInt(1, 11), random.nextBoolean(),
                    random.nextBoolean(), random.nextBoolean(), random.nextBoolean(), TicketType.getTicketType(),
                    random.nextDouble(250.5, 12000), random.nextInt(1, 6), TransportationType.getRandomTransport()));
        }
    }

    public void showAll() {
        System.out.println(allPorposalsText);
        System.out.println(upperBound);
        for (var ticket : this.touristTickets) {
            System.out.println(ticket);
        }
        System.out.println(lowerBound);
    }

    public boolean isSame(String choice, boolean real) {
        var check = choice.equalsIgnoreCase("yes");
        return check == real;
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