package at.majohannsen.parkticket;
import java.util.ArrayList;
import java.util.List;

public class TicketBox {

    private List<Ticket> Tickets = new ArrayList<>();
    private Ticket insertedTicket = null;
    private double currentPrice = 0;

    Ticket getTicket() {
        Ticket ticket = new Ticket();
        Tickets.add(ticket);
        return ticket;
    }

    int insertTicket(long id) {
        if (insertedTicket == null) {
            insertedTicket = (new Scanner()).scan(Tickets, id);
            if (insertedTicket != null) return 1;
            else return 0;
        }
        return -1;
    }

    double getPrice() {
        if (insertedTicket != null) {
            return currentPrice = insertedTicket.getPrice();
        }
        else return Double.MAX_VALUE;
    }

    double insertMoney(double amount) {
        currentPrice -= amount;
        if (currentPrice <= 0) {
            (new Dispenser()).dispense(-currentPrice);
            currentPrice = 0;
            insertedTicket.closeTicket();
            insertedTicket = null;
        }
        return currentPrice;
    }

}
