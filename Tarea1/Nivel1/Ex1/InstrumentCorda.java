public class InstrumentCorda extends Instrument {

    public InstrumentCorda(String nom, int preu) {
        super(nom, preu);
    }

    @Override
    public String tocar(){
        return "Está sonando un instrumento de cuerda llamado " + getNom() + " con un precio de "
                + getPreu() +"€";
    }

    @Override
    public String toString() {
        return "InstrumentCorda{} " + super.toString();
    }
}
