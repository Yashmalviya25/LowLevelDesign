import repositories.GateRepository;
import repositories.TicketRepository;
import repositories.VehicleRepository;
import services.TicketService;

public class Client {
    public static void main(String[] args) {
        GateRepository gateRepository = new GateRepository();
        TicketRepository ticketRepository = new TicketRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();
        TicketService ticketService = new TicketService(
                gateRepository,
                vehicleRepository,
                ticketRepository
        );
    }
}
