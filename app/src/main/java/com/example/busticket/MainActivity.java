package com.example.busticket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.busticket.Model.BusTickedOld;
import com.example.busticket.Model.BusTicket;
import com.example.busticket.Model.BusTicketChild;

public class MainActivity extends AppCompatActivity {

    BusTicket busTicket = new BusTicket(70,9);
    BusTicket busTicketChild = new BusTicketChild(70,11,50);
    BusTicket busTicketOld = new BusTickedOld(70,5,30);

    private TextView busTicketTotalOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // присваивание переменным активити элементов представления activity_main
        busTicketTotalOut = findViewById(R.id.busTicketTotalOut); // вывод информации стоимости всех билетов

        busTicketTotalOut.setText(Float.toString(busTicket.ticketPriceAll() + busTicketChild.ticketPriceAll() + busTicketOld.ticketPriceAll()) + " монет");


    }
}