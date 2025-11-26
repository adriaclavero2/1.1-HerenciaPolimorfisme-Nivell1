public abstract class Instrument {
    private String name;
    private int price;

    static {
        System.out.println("Abstract Instrument class is loaded.");
    }

    public static final String INSTRUMENT = "instrument";

    public Instrument(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public abstract String play();

    @Override
    public String toString() {
        return "Instrument{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}