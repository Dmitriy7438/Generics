package ru.netology.ticket;

import java.util.Objects;

public class Ticket implements Comparable<Ticket> {
    private int id;
    private int price;
    private String fromAirport;
    private String toAirport;
    private int time;

    public Ticket(int id, int price, String fromAirport, String toAirport, int time) {
        this.id = id;
        this.price = price;
        this.fromAirport = fromAirport;
        this.toAirport = toAirport;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public String getFromAirport() {
        return fromAirport;
    }

    public String getToAirport() {
        return toAirport;
    }

    public int getTime() {
        return time;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setFromAirport(String fromAirport) {
        this.fromAirport = fromAirport;
    }

    public void setToAirport(String toAirport) {
        this.toAirport = toAirport;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "" + id;
    }

    @Override
    public int compareTo(Ticket otherTicket) {
        if (price < otherTicket.price) {
            return -1;
        }
        if (price > otherTicket.price) {
            return 1;
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return id == ticket.id && price == ticket.price && time == ticket.time && Objects.equals(fromAirport, ticket.fromAirport) && Objects.equals(toAirport, ticket.toAirport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, price, fromAirport, toAirport, time);
    }
}
