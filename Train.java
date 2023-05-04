import java.util.ArrayList;
/**
 * Creates the train, which includes information on the engine, the individual cars, and the passengers on those cars 
 * @author Nalini Oliver
 * Resources CSC 120 TA hours (Wednesday and Thursday), Lecture slides on Moodle 
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
     * @param fueltype is the type of fuel on the train 
     * @param fuelCapacity is the maximum value of fuel that can exist 
     * @param nCars is the number of cars that make up the train
     * @param passengerCapacity is the total number of passengers that can exist
     */
    public Train(FuelType fueltype, double fuelCapacity, int nCars, int passengerCapacity){
        this.engine = new Engine(FuelType.STEAM, 4, 20);
        this.car = car;
    }

    /**
     * Will return the information on the engine 
     * @return the engine, which includes information pertaining to the engine (fuel type, capacity)
     */
    public Engine getEngine() {
        return this.engine;
    }

    /**
     * Creates a new train called Tank with a fuel type of steam, a fuel capacity of 40, 7 train cars, and a passsenger capacity of 80
     */
    public static void main(String[] args) {
        Train Tank = new Train(FuelType.STEAM, 40, 7, 80);
    }

}
