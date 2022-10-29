package touristAtraction;


public class TouristTicket {
    protected TouristTicketTitle title;
    protected int period;
    protected int peopleAmount;
    protected boolean hasChild;
    protected boolean hasAnimal;
    protected boolean needNoiseReduction;
    protected boolean includesParty;
    protected TicketType type;
    protected double price;
    protected int hotelRating;
    protected TransportationType transportationType;

    public TouristTicket(TouristTicketTitle title, int period, int peopleAmount, boolean hasChild, boolean hasAnimal,
                         boolean needNoiseReduction, boolean includesParty, TicketType type, double price,
                         int hotelRating, TransportationType transportationType) {
        this.title = title;
        this.period = period;
        this.peopleAmount = peopleAmount;
        this.hasChild = hasChild;
        this.hasAnimal = hasAnimal;
        this.needNoiseReduction = needNoiseReduction;
        this.includesParty = includesParty;
        this.type = type;
        this.price = price;
        this.hotelRating = hotelRating;
        this.transportationType = transportationType;
    }


    @Override
    public String toString() {
        return String.format("│%15s ││%15s ││%8d ││%11.2f ││%14d│",
                title, type, period, price, hotelRating);
    }

    public int getPeriod() {
        return period;
    }

    public int getPrice() {
        return (int)price;
    }

    public int getHotelRating() {
        return hotelRating;
    }

    public TouristTicketTitle getTitle() {
        return title;
    }

    public int getPeopleAmount() {
        return peopleAmount;
    }

    public boolean isHasChild() {
        return hasChild;
    }

    public boolean isHasAnimal() {
        return hasAnimal;
    }

    public boolean isNeedNoiseReduction() {
        return needNoiseReduction;
    }

    public boolean isIncludesParty() {
        return includesParty;
    }

    public TransportationType getTransportationType() {
        return transportationType;
    }
};