package be.uantwerpen.sd.labs.lab3.observer;

/*
TODO: Announce new bids in the console.
Methods you will implement:
  - void update(String event, Object payload)
TIP: If event equals your chosen name (e.g., 'bidPlaced'), print bidder and amount.
*/
public class ConsoleAnnouncer implements Observer {
    @Override
    public void update(String event, Object payload){
        if (event == "highest" && payload instanceof Bid) {
            System.out.println("A new bid has come in, the highest bid is: " + ((Bid) payload).getAmount());
        }
    }
}
