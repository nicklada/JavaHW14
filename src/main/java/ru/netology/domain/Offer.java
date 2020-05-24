package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Offer implements Comparable<Offer> {
    private int id;
    private int price;
    private String from;
    private String to;
    private int time;

    @Override
    public int compareTo(Offer o) {
        return price - o.price;
    }
}

