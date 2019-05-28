import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person1;
    private Person person2;
    private BusStop busStop;

    @Before
    public void setup() {
        bus = new Bus("Hamilton");
        person1 = new Person("Robert");
        person2 = new Person("Emily");
        busStop = new BusStop("Buchanan Bus Station");
    }

    @Test
    public void busHasDesitination() {
        assertEquals("Hamilton", bus.getDestination());
    }

    @Test
    public void busPassengerNumber() {
        assertEquals(0, bus.passengerNumbers());
        assertEquals(20, bus.getCapacity());
    }

    @Test
    public void canAddPassenger() {
        bus.addPassenger(person1);
        bus.addPassenger(person2);
        assertEquals(18, bus.getCapacity());
        assertEquals(2, bus.passengerNumbers());

    }

    @Test
    public void canRemovePassenger() {
        bus.addPassenger(person1);
        bus.removePassenger(person1);
        assertEquals(0, bus.passengerNumbers());
        assertEquals(20, bus.getCapacity());
    }

    @Test
    public void canAddPassengerFromBusStop() {
        busStop.addToQueue(person1);
        bus.pickUpFromBusStop(busStop,person1);
        assertEquals(0, busStop.queueLength());
        assertEquals(1, bus.passengerNumbers());
        assertEquals(19, bus.getCapacity());
    }
}
