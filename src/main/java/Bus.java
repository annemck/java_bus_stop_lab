import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;


    public Bus(String destination){
        this.destination = destination;
        this.capacity = 20;
        this.passengers = new ArrayList<Person>();
    }

    public String getDestination() {
        return this.destination;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void addPassenger(Person person) {
        if (this.capacity > 0){
            this.passengers.add(person);
            this.capacity -= 1;
        }
    }

    public int passengerNumbers() {
       return this.passengers.size();
    }

    public void removePassenger(Person person) {
        this.passengers.remove(person);
        this.capacity += 1;
    }

    public void pickUpFromBusStop(BusStop busStop, Person person) {
        busStop.removeFromQueue(person);
        this.addPassenger(person);
    }
}
