package com.example.busticket.Model;

public class BusTickedOld extends BusTicket {
    // задание полей
    private float ticketDiscountOld; // скидка на билет пенсионера

    public BusTickedOld() {
    }

    public BusTickedOld(float ticketPrice, int numberOfTickets, float ticketDiscountOld) {
        super(ticketPrice, numberOfTickets);
        this.ticketDiscountOld = ticketDiscountOld;
    }

    public float ticketPriceAll() {
        return (getTicketPrice() * getNumberOfTickets() * (100 - ticketDiscountOld))/100;
    }

}
