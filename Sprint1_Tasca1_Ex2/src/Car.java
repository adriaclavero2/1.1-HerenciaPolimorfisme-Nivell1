public class Car {
    private static final String brand = "Honda";
    private static String model;
    private final int power;

    public Car(String model, int power) {
        Car.model = model;
        this.power = power;
    }

    public static void brake() {
        System.out.println("The car is braking");
    }

    public void accelerate() {
        System.out.println("The car is accelerating");
    }
}