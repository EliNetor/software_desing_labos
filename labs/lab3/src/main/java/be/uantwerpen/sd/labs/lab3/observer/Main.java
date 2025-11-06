package be.uantwerpen.sd.labs.lab3.observer;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        /*
            TODO: Create an Auction, attach observers, then place a few bids to see notifications.
            TIP: auction.addObserver(new ConsoleAnnouncer()); ...
        */

        Auction auction = new Auction();
        Bid bid1 = new Bid("Jef", 200);
        Bid bid2 = new Bid("An", 100);
        Bid bid3 = new Bid("Bob", 300);

        auction.place(bid1);
        auction.place(bid2);
        auction.place(bid3);
    }
}
