import ru.netology.ticket.Ticket;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Ticket[] tickets = {
                new Ticket(10, 1299, "SVO", "KZN", 95),
                new Ticket(2, 1299, "VKO", "KZN", 95),

        };

        System.out.println(Arrays.toString(tickets));
        Arrays.sort(tickets);
        System.out.println(Arrays.toString(tickets));
    }
}
