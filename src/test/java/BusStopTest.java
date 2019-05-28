import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Person person1;

    @Before
    public void setup() {
        this.busStop = new BusStop("Buchanan Bus Station");
    }

    @Test
    public void busStopHasName() {
        assertEquals("Buchanan Bus Station", busStop.getName());
    }

    @Test
    public void queueStartsEmpty() {
        assertEquals(0, busStop.queueLength());
    }

    @Test
    public void personCanJoinQueue(){
        busStop.addToQueue(person1);
        assertEquals(1, busStop.queueLength());
    }

    @Test
    public void personCanLeaveQueue() {
        busStop.addToQueue(person1);
        busStop.removeFromQueue(person1);
        assertEquals(0, busStop.queueLength());
    }
}
