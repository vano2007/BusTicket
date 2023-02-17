package com.example.busticket.Model;

public class BusTicketChild extends BusTicket {
    // задание полей
    private float ticketDiscountChild; // скидка на детский билет

    public BusTicketChild() {
    }

    public BusTicketChild(float ticketPrice, int numberOfTickets, float ticketDiscountChild) {
        super(ticketPrice, numberOfTickets);
        this.ticketDiscountChild = ticketDiscountChild;
    }

    public float ticketPriceAll() {
        return (getTicketPrice() * getNumberOfTickets() * (100 - ticketDiscountChild))/100; // нужно умножить количество билетов на стоимость одного билета и на скидку и всё разделить на 100
    }

}
