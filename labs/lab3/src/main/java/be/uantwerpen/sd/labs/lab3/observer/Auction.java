package be.uantwerpen.sd.labs.lab3.observer;


import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/*
TODO: Implement Subject and notify observers when a new bid arrives.
Fields you will need:
  - Set<Observer> observers
Methods you will implement:
  - void addObserver(Observer o)
  - void removeObserver(Observer o)
  - void notifyObservers(String event, Object payload)
  - void place(Bid bid)
TIP: Pick an event name (e.g., 'bidPlaced') and send the Bid as payload.
*/
public class Auction implements Subject {
    private Bid highest;
    private Set<Observer> observers;
    private MaxBidTracker maxbid = new MaxBidTracker();
    private ConsoleAnnouncer consoleAnnouncer = new ConsoleAnnouncer();

    public Auction(){
        this.observers = new HashSet<>();
        observers.add(maxbid);
        observers.add(consoleAnnouncer);
    }

    public void place(Bid bid) {
        /*
            TODO: Accept a bid, update the highest bid when appropriate, and notify observers.
            TIP: Compare with current highest; notify with your chosen event name.
        */
        if (bid != null && bid.getAmount() > this.maxbid.getMax()){
            highest = bid;
        }
        notifyObservers("highest", highest);

    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    @Override
    public void notifyObservers(String event, Object payload) {
        for (Observer observer : observers) {
            observer.update(event, payload);
        }
    }

    public Bid highest() {
        return highest;
    }
}
