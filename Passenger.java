/**
 * Prompts the program to allow passengers to board or get off the train car, and deals with exceptions (i.e- train car has hit capacity, or no one is on the train car).
 * @author Nalini Oliver
 * Resources CSC 120 TA hours (Wednesday and Thursday), Lecture slides on Moodle 
 */
public class Passenger {

    /**
     * Will allow a specific passenger to board one of the cars by using the addPassenger() method from the Car class. If this method runs and has an exception, this method (boardCar) will catch the exception and print "Train at capacity!".
     * @param c is the car that the passenger will board
     */
    public void boardCar(Car c) {
        try {c.addPassenger(this);
        } catch (Exception e) {
            System.out.println("Train at capacity!");
        }
    }

    /**
     * Will allow a specific passenger to get off one of the cars by using the removePassenger() method from the Car class. If this method runs and has an exception, this method (getOffCar) will catch the exception and print "No people on the train!".
     * @param c is the car that the passenger will leave. 
     */
    public void getOffCar(Car c) {
        try {c.removePassenger(this);
        } catch (Exception e) {
            System.out.println("No people on the train!");
        }
    }

}
