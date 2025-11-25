public class InstrumentVent extends Instrument {

    public InstrumentVent(String nom, int preu) {
        super(nom, preu);
    }

    @Override
    public String tocar(){
        return "Está sonando un instrumento de viento llamado " + getNom() + " con un precio de "
                + getPreu() +"€";
    }

    @Override
    public String toString() {
        return "InstrumentVent{} " + super.toString();
    }
}
