package Task1;

public class Main {
    public static void main(String[] args) {

    //  In the main method, instantiate a new Driver, populating the fields with your own name and age.
        Driver d1 = new Driver("Marcus", 20);

    // In the main method, instantiate a new car, populating the field with whatever values you see fit.
        Car c1 = new Car("Ford","Fiesta",2003,"Racecar");

    // In the main method, assign the driver to the car created, using the setter method created in step 1.e
        c1.setDriver(d1);

    // print the toString method of the car you've created followed by the toString method of the driver.
        System.out.println(c1);
        System.out.println(d1);

    // In the main method, create yet another car and assign the same driver to this car.
        Car c2 = new Car("Fiat","Multipla",2001,"Racecar");
        c2.setDriver(d1);
    // repeat the step 1.k for the new car created in 1.l.
        System.out.println(c2);
        System.out.println(d1);
    }
}