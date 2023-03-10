/**
 * Creates the engine, including the fuel type, the current fuel level, the max fuel level, and the ability to "lose" fuel in incriments of 10
 * @author: Nalini Oliver
 * Resources: CSC 120 TA hours (Wednesday and Thursday), Lecture slides on Moodle 
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
     * Will return the current fuel level of the train
     * @return: current train fuel level 
     */
    public double getcurrent() {
        return this.current;
    }

    /**
     * Will return the maximum possible fuel level 
     * @return max: maximum possible fuel level that the train has 
     */
    public double getmax() {
        return this.max;
    }

    /**
     * Assigns the attributes based on how we defined the attributes listed above
     * @param current: current fuel level of the train
     * @param max: maximum possible fuel level of the train
     */
    public Engine(double current, double max){
        this.current = current;
        this.max = max;
    } 
    
    /**
     * Will put the train's fuel level back to the maximum possible value 
     * @param current: the current fuel level of the train 
     * @param max: the maximum possible fuel level of the train 
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
            throw new RuntimeException("Fuel is at 0!");
        }

    }


}