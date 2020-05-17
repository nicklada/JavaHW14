package ru.netology.repository;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import ru.netology.domain.Offer;

@AllArgsConstructor
@NoArgsConstructor
public class OfferRepository {
    private Offer[] tickets = new Offer[0];

    public void save(Offer item) {
        int length = tickets.length + 1;
        Offer[] tmp = new Offer[length];
        System.arraycopy(tickets, 0, tmp, 0, tickets.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        tickets = tmp;
    }

    public Offer[] findAll() {
        return tickets;
    }

    public Offer findById(int id) {
        for (Offer offer : tickets) {
            if (offer.getId() == id) {
                return offer;
            }
        }
        return null;
    }

    public void removeById(int id) {
        int length = tickets.length - 1;
        Offer[] tmp = new Offer[length];
        int index = 0;
        for (Offer film : tickets) {
            if (film.getId() != id) {
                tmp[index] = film;
                index++;
            }
        }
        tickets = tmp;
    }

    public void removeAll() {
        tickets = new Offer[0];
    }
}
