public class WindInstrument extends Instrument {

    public WindInstrument(String name, int price) {
        super(name, price);
    }

    @Override
    public String play(){
        return "A wind instrument is playing " + getName() + " with a price of "
                + getPrice() +"€";
    }

    @Override
    public String toString() {
        return "WindInstrument{} " + super.toString();
    }
}
