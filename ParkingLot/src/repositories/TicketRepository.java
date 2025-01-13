package repositories;

import Models.Ticket;

import java.util.Map;
import java.util.TreeMap;

public class TicketRepository {
    private final Map<Integer, Ticket> tickets;
    private  static int previousId = 0;
    public TicketRepository() {
        tickets = new TreeMap<>();
    }

    public  Ticket save(Ticket ticket) {
        previousId++;
        ticket.setId(previousId);
        tickets.put((ticket.getId()), ticket);;
        return ticket;
    }
}
