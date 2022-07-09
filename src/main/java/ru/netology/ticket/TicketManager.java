package ru.netology.ticket;

import java.util.Arrays;

public class TicketManager {

    private TicketRepository repository;

    public TicketManager(TicketRepository repository) {
        this.repository = repository;
    }

    public Ticket[] findTickets(String fromAirport, String toAirport) {
        Ticket[] ans = new Ticket[0];
        for (Ticket ticket : repository.findAll()) {
            if (ticket.getFromAirport().equals(fromAirport) && ticket.getToAirport().equals(toAirport)) {
                Ticket[] tmp = new Ticket[ans.length +1];
                for (int i = 0; i < ans.length; i++) {
                    tmp[i] = ans[i];
                }
                tmp[tmp.length - 1] = ticket;
                ans = tmp;
            }
        }
        Arrays.sort(ans);
        return ans;
    }
}
