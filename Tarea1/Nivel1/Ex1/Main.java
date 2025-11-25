import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Instrument>listaInstrumentos = new ArrayList<>();
        listaInstrumentos.add(new InstrumentVent("flauta", 25));
        listaInstrumentos.add(new InstrumentCorda("guitarra",80));

        for( Instrument I : listaInstrumentos ) {
            System.out.println(I.tocar());
        }
    }
}
