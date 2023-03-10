import java.util.ArrayList;

/**
 * Creates the train car, including the maximum capacity of the car, the remaining number of seats once passengers have boarded, the ability to add/remove passengers, and printing out a list of the passengers.
 * @author: Nalini Oliver
 * Resources: CSC 120 TA hours (Wednesday and Thursday), Lecture slides on Moodle 
 */
public class Car {
    /**
     * Creates an attribute called "capacity" that has the type integer
     * Capacity refers to the maximum number of passengers that can exist on the train
     */
    private int capacity;
    /**
     * Names an array list of the passengers that are on the train, named "passengers"
     */
    private ArrayList<Passenger> passengers;
    
    
    /**
     * Assigns the capacity of the car, and creates an array list that is the size of the train's capacity
     * @param capacity: Maximum number of passengers that can exist on the train
     */
    public Car(int capacity) {
        this.capacity = capacity; 
        this.passengers = new ArrayList<Passenger>(capacity);
    }

    /**
     * Will return the total number of passengers that can exist on the train (aka, capacity)
     * @return: the capacity: the total number of passengers that can exist on the train)
     */
    public int getCapacity() {
        return this.capacity;
    }

    /**
     * Will return the number of open seats left on the train 
     * @return: remaining seats: the number of seats that are open on the train
     */
    public int seatsRemaining() {
        return this.capacity - this.passengers.size();
    }

    /**
     * Will add a passenger to the train car, unless the car is at capacity. If so, it will throw an exception. 
     * @param p: the new passenger that we're attempting to add to the train 
     */
    public void addPassenger(Passenger p) {
        if (this.passengers.size() < this.capacity) {
            passengers.add(p);
        }
        else {
           throw new RuntimeException("Car is at capacity!");
        }
    }

        
    /**
     * Will remove a passenger from the train car, unless there is already no one on the car. If so, will throw an exception.
     * @param d: the passenger we're attempting to remove from the train
     */
    public void removePassenger(Passenger d) {
        if (this.passengers.size() > 0) {
            passengers.remove(d);
        }
        else {
            throw new RuntimeException("There's no passengers!");
        }
    }
    /**
     * Prints all the passengers that are on the train 
     */
    public void printManifest() {
        System.out.println(passengers);

    }

}