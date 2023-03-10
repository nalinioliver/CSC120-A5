import java.util.ArrayList;
/**
 * Creates the train, which includes information on the engine, the individual cars, and the passengers on those cars 
 * @author: Nalini Oliver
 * Resources: CSC 120 TA hours (Wednesday and Thursday), Lecture slides on Moodle 
 */
public class Train {
    /**
     * Will create the engine attribute
     */
    private final Engine engine;
    
    /**
     * Names an array list of the cars that make up the train, known as "car"
     */
    private ArrayList<Car> car;

    
    /**
     * Establishes the information that will be needed to create the train, which includes the engine (fuel type, fuel capacity), and cars (number of cars, number of passengers)
     * @param fueltype: the type of fuel on the train 
     * @param fuelCapacity: the maximum value of fuel that can exist 
     * @param nCars: the number of cars that make up the train
     * @param passengerCapacity: the total number of passengers that can exist
     */
    public Train(FuelType fueltype, double fuelCapacity, int nCars, int passengerCapacity){
        this.engine = engine;
        this.car = car;
    }

    /**
     * Will return the information on the engine 
     * @return: engine, which includes information pertaining to the engine (fuel type, capacity)
     */
    public Engine getEngine() {
        return this.engine;
    }

}
