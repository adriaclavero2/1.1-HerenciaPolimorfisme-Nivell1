public class Main {
    public static void main(String[] args) {

        Car c1 = new Car("Civic", 120);
        c1.accelerate();

        Car c2 = new Car("Accord", 180);
        c2.accelerate();

        Car.brake();
    }
}