import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Instrument>instrumentList = new ArrayList<>();
        instrumentList.add(new WindInstrument("flute", 25));
        instrumentList.add(new StringInstrument("guitar",80));

        for( Instrument I : instrumentList ) {
            System.out.println(I.play());
        }
    }
}
