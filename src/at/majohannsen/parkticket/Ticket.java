package at.majohannsen.parkticket;

import java.util.Date;
import java.util.Random;

public class Ticket {
    private long id = (new Random()).nextInt(100);
    private Date startTimestamp = new Date();
    private Date endTimestamp = null;

    boolean closeTicket() {
        if (endTimestamp == null) {
            endTimestamp = new Date();
            return true;
        }
        return false;
    }

    double getPrice() {
        return ((new Date()).getTime() - startTimestamp.getTime())/(double)60000;
    }

    public Date getStartTimestamp() {
        return startTimestamp;
    }

    public long getId() {
        return id;
    }
}
