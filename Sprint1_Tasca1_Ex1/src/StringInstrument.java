public class StringInstrument extends Instrument {

    public StringInstrument(String name, int price) {
        super(name, price);
    }

    @Override
    public String play(){
        return "A string instrument is playing " + getName() + " whit a price of "
                + getPrice() +"€";
    }

    @Override
    public String toString() {
        return "StringInstrument{} " + super.toString();
    }
}
