package ru.netology.ru.netology.manager;

import ru.netology.domain.Offer;
import ru.netology.repository.OfferRepository;

import java.util.Arrays;

public class OfferManager {

    private OfferRepository repository;
    private String from;
    private String to;

    public OfferManager(OfferRepository repository) {
        this.repository = repository;
    }

    // public OfferManager(OfferRepository repository, String from, String to) {
    //    this.repository = repository;
    //   this.from = from;
    //  this.to = to;
    //}

    public void offerAdd(Offer ticket) {
        repository.save(ticket);
    }

    public Offer[] findAll(String from, String to) {
        Offer[] result = new Offer[0];
        for (Offer ticket : repository.findAll()) {
            if (ticket.getFrom().equalsIgnoreCase(from) && ticket.getTo().equalsIgnoreCase(to)) {
               Offer[] tmp = new Offer[result.length+1];
               System.arraycopy (result,0, tmp,0, result.length);
               tmp[tmp.length-1] = ticket;
               result = tmp;
            }
        }
        Arrays.sort(result);
        return result;
    }
}