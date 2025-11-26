import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println(Instrument.INSTRUMENT);


        List<Instrument> instrumentList = new ArrayList<>();
        instrumentList.add(new WindInstrument("flute", 25));
        instrumentList.add(new StringInstrument("guitar", 80));

        for (Instrument i : instrumentList) {
            System.out.println(i.play());
        }
    }
}