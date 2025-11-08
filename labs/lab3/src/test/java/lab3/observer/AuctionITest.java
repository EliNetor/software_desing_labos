package lab3.observer;
import be.uantwerpen.sd.labs.lab3.observer.Auction;
import be.uantwerpen.sd.labs.lab3.observer.Bid;
import be.uantwerpen.sd.labs.lab3.observer.MaxBidTracker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class AuctionITest {
    @Test
    public void ActionITest() {
        Auction auction = new Auction();
        MaxBidTracker maxBidTracker = new MaxBidTracker();
        auction.addObserver(maxBidTracker);


        Bid bid1 = new Bid("Bob1", -100);
        Bid bid2 = new Bid("Bob2", 100);
        Bid bid3 = new Bid("Bob3", 50);
        Bid bid4 = new Bid("Bob4", 150);

        //check for negative bids
        auction.place(bid1);
        assertNotEquals(bid1, auction.highest());
        assertNotEquals(-100, maxBidTracker.getMax());

        //check if name and bid ammount of higher bid are correct
        auction.place(bid2);
        assertEquals(bid2, auction.highest());
        assertEquals(100, maxBidTracker.getMax());

        //check if lower bid is rejected
        auction.place(bid3);
        assertNotEquals(bid3, auction.highest());
        assertNotEquals(50, maxBidTracker.getMax());

        //check if bid is updated after higher bid.
        auction.place(bid4);
        assertEquals(bid4, auction.highest());
        assertEquals(150, maxBidTracker.getMax());
    }
}
