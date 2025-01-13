package services;

import Models.Gate;
import Models.Ticket;
import Models.VehicleType;
import repositories.GateRepository;
import repositories.TicketRepository;
import repositories.VehicleRepository;

import java.util.Date;
import java.util.Optional;

public class TicketService {

    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private TicketRepository ticketRepository;
    public TicketService(VehicleRepository vehicleRepository, GateRepository gateRepository, TicketRepository ticketRepository) {
        this.vehicleRepository = vehicleRepository;
        this.gateRepository = gateRepository;
        this.ticketRepository = ticketRepository;
    }
    public Ticket issueTicket(int gateId,
                              String vehicleNumber,
                              String ownerName,
                              VehicleType vehicleType) {
        Ticket ticket = new Ticket();

        Optional<Gate> gateOptional = gateRepository.findGateById(gateId);
        if (gateOptional.isPresent()) {
            Gate gate = gateOptional.get();
            ticket.setGate(gate);
            ticket.setOperator(gate.getOperator());
            ticket.setEntryTime((java.sql.Date) new Date());
        }
        return ticket;
    }
}
