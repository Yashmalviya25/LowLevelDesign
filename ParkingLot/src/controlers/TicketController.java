package controlers;

import Models.Ticket;
import dtos.IssueTicketRequestDTO;
import dtos.IssueTicketResponseDTO;
import dtos.ResponseStatus;
import services.TicketService;

public class TicketController {
    private TicketService ticketService;
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;

    }
    public IssueTicketResponseDTO issueTicket(IssueTicketRequestDTO requestDTO) {
       IssueTicketResponseDTO responseDTO = new IssueTicketResponseDTO();
       try {
           Ticket ticket = ticketService.issueTicket(requestDTO.getGateId(),
                   requestDTO.getVehicleNumber(),
                   requestDTO.getOwnerName(),
                   requestDTO.getVehicleType());
           responseDTO.setTicketId(ticket.getId());
           responseDTO.setSlotNumber(responseDTO.getSlotNumber());
           responseDTO.setResponseStatus(ResponseStatus.Success);

       }
       catch (Exception e) {
           responseDTO.setResponseMessage(e.getMessage());
           responseDTO.setResponseStatus(ResponseStatus.Failure);
       }
       return responseDTO;

    }
}

