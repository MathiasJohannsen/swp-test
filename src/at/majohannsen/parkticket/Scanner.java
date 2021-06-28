package at.majohannsen.parkticket;

import java.util.List;

public class Scanner {

    Ticket scan(List<Ticket> Tickets, long id) {
        for (Ticket t : Tickets) {
            if (t.getId() == id) {
                return t;
            }
        }
        return null;
    }
}
