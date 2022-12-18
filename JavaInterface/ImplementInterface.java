/**
 * program to make interface
 * and put all common functionalities
 * and implement all these functionalities in their own class in their own way.
 */

 
package JavaInterface;

interface Vehicle {
    void changeGear(int a);

    void speedUp(int a);

    void applyBrakes(int a);

}

    class Bicycle implements Vehicle {
        int speed, gear;
        @Override
         public void changeGear(int newGear) {
             gear = newGear;
         }
        @Override
        public void speedUp(int increment) {
            speed = speed + increment;
        }
        @Override
        public void applyBrakes(int decrement) {
            speed = speed - decrement;
        }

        public void printStates() {
            System.out.println("speed: " + speed + " " + "gear: " + gear );
        }
    }

    class Bike implements Vehicle {
        int speed, gear;
        @Override
        public void changeGear(int newGear) {
            gear = newGear;
        }
        @Override
        public void speedUp(int increment) {
            speed = speed + increment;
        }

        @Override
        public void applyBrakes(int decrement) {
            speed = speed - decrement;
        }

        public void printStates() {
            System.out.println("speed: " + speed + " " + "gear: " + gear);
        }
    }


public class ImplementInterface {
    public static void main(String[] args) {
        Bicycle bc = new Bicycle();
        bc.changeGear(2);
        bc.speedUp(64);
        bc.applyBrakes(30);
        System.out.println("Bicycle current state: ");
        bc.printStates();
        Bike bk = new Bike();
        bk.changeGear(6);
        bk.speedUp(80);
        bk.applyBrakes(20);
        System.out.println("Bike current state: ");
        bk.printStates();
    }
}

/**
 * output
 * Bicycle current state:
 * speed: 34 gear: 2
 * Bike current state:
 * speed: 60 gear: 6
 */
