package lab3.observer;

import be.uantwerpen.sd.labs.lab3.observer.Bid;
import be.uantwerpen.sd.labs.lab3.observer.MaxBidTracker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxBidTrackerUTest {
    @Test
    public void MaxBidTrackerTest() {
        MaxBidTracker maxBidTracker = new MaxBidTracker();

        //check if inital vallue is 0
        assertEquals(0, maxBidTracker.getMax());

        Bid bid_bob = new Bid("Bob", 1);
        maxBidTracker.update("highest", bid_bob);
        //check if maxbid is updated correctly
        assertEquals(1, maxBidTracker.getMax());

        maxBidTracker.update("highest", 10);
        //check if maxbid doesnt get updated if payload is not Bid object
        assertEquals(1, maxBidTracker.getMax());

        maxBidTracker.update("random", 100);
        //check if it stays one with a wrong event so not "highest"
        assertEquals(1, maxBidTracker.getMax());
    }
}
