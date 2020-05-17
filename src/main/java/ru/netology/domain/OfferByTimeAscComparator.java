package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Comparator;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class OfferByTimeAscComparator implements Comparator <Offer> {
    private int id;
    private int price;
    private String from;
    private String to;
    private int time;

    @Override
    public int compare(Offer o1, Offer o2) {
        return o1.getTime() - o2.getTime();
    }
}
