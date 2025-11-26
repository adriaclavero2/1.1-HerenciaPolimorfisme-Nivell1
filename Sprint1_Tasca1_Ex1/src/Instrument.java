public abstract class Instrument {
    private String name;
    private int price;

    public Instrument(String name, int preu) {
        this.name = name;
        this.price = preu;
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
                "nom='" + name + '\'' +
                ", preu=" + price +
                '}';
    }
}
