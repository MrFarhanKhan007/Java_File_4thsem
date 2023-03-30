interface MotorBike {
    void start();
    void stop();
    void accelerate();
    void brake();
}
interface Cycle {
    void pedal();
    void brake();
}
class TwoWheeler implements MotorBike, Cycle {
    private int distance = 0;
    private int speed = 0;
    public void start() {
        System.out.println("Starting the two-wheeler.");
    }
    public void stop() {
        System.out.println("Stopping the two-wheeler.");
    }
    public void accelerate() {
        speed += 10;
        System.out.println("Accelerating. Current speed: " + speed + " km/h.");
    }
    public void brake() {
        speed -= 10;
        System.out.println("Braking. Current speed: " + speed + " km/h.");
    }
    public void pedal() {
        distance += 1;
        System.out.println("Pedaling. Current distance: " + distance + " km.");
    }
}
public class Experiment18 {
    public static void main(String[] args) {
        TwoWheeler twoWheeler = new TwoWheeler();
        // Test the MotorBike methods
        twoWheeler.start();
        twoWheeler.accelerate();
        twoWheeler.accelerate();
        twoWheeler.brake();
        twoWheeler.stop();
        // Test the Cycle methods
        twoWheeler.pedal();
        twoWheeler.pedal();
        twoWheeler.pedal();
    }
}