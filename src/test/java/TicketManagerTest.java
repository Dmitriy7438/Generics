import org.junit.jupiter.api.Test;
import ru.netology.ticket.Ticket;
import ru.netology.ticket.TicketManager;
import ru.netology.ticket.TicketRepository;

import static org.junit.jupiter.api.Assertions.*;

public class TicketManagerTest {

    Ticket ticket1 = new Ticket(10, 1299, "SVO", "KZN", 95);
    Ticket ticket2 = new Ticket(20, 1199, "SVO", "MOS", 95);
    Ticket ticket3 = new Ticket(30, 1099, "MOS", "KZN", 95);
    Ticket ticket4 = new Ticket(40, 1399, "SVO", "KZN", 95);

    @Test
    public void shouldFindAndSort() {
        TicketManager manager = createManager();

        Ticket[] actual = manager.findTickets("SVO", "KZN");
        Ticket[] expected = {ticket1, ticket4};

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindAndSort1() {
        TicketManager manager = createManager();

        Ticket[] actual = manager.findTickets("SVG", "KZA");
        Ticket[] expected = new Ticket[0];

        assertArrayEquals(expected, actual);

    }
    private TicketManager createManager() {
        TicketRepository ticketRepository = new TicketRepository();
        ticketRepository.addTicket(ticket1);
        ticketRepository.addTicket(ticket2);
        ticketRepository.addTicket(ticket3);
        ticketRepository.addTicket(ticket4);

        return new TicketManager(ticketRepository);
    }
}
