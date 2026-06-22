package ticket.booking.entities;

import java.util.List;

public class User {
    private String name;
    private String hashPassword;
    private List<Ticket> ticketBooked;
    private String userID;

    public User(String name, String hashPassword, List<Ticket> ticketBooked, String userID) {
        this.name = name;
        this.hashPassword = hashPassword;
        this.ticketBooked = ticketBooked;
        this.userID = userID;
    }
}
