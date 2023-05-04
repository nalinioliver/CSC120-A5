/**
 * Creates the engine, including the fuel type, the current fuel level, the max fuel level, and the ability to "lose" fuel in incriments of 10
 * @author Nalini Oliver
 * Resources CSC 120 TA hours (Wednesday and Thursday), Lecture slides on Moodle 
 */
public class Engine {
    /**
     * Creates an attribute for "FuelType" that will represent whatever fuel type the user chooses
     */
    private FuelType f;

    /**
     * Creates an attribute that will store the current fuel level 
     */
    private double current;
    /**
     * Creates an attribute that will store the maximum fuel level 
     */
    private double max;

    /**
     * Will return the fuel type 
     * @return the fuel type 
     */
    public FuelType getfuel() {
        return this.f;
    }

    /**
     * Will return the current fuel level of the train
     * @return the current train fuel level 
     */
    public double getcurrent() {
        return this.current;
    }

    /**
     * Will return the maximum possible fuel level 
     * @return maximum possible fuel level that the train has 
     */
    public double getmax() {
        return this.max;
    }

    /**
     * Assigns the attributes based on how we defined the attributes listed above
     * @param f is the fuel type of the train
     * @param current is the current fuel level of the train
     * @param max is the maximum possible fuel level of the train
     */
    public Engine(FuelType f, double current, double max){
        this.f = f;
        this.current = current;
        this.max = max;
    } 
    
    /**
     * Will put the train's fuel level back to the maximum possible value 
     * @param current is the current fuel level of the train 
     * @param max is the maximum possible fuel level of the train 
     */
    public void refuel(double current, double max) {
        this.max = current;
    }

    /**
     * Will decrease the fuel level of the train by an increment of ten. However, if the fuel level is less than 10, it will throw an exception
     */
    public void go() {
        if (current > 10) {
            current = current-10;
            System.out.println("The remaining fuel is" + current);
        } 
        else {
            throw new RuntimeException("Cannot remove any more fuel!");
        }

    }

    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.STEAM, 4, 20);
    }


}