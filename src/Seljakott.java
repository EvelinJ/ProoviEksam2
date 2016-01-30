import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Evelin.Jogi on 23.01.2016.
 */
public class Seljakott {
    List<String> kott = new ArrayList<String>();
    private String omanik;
    public Seljakott (String omanikuNimi) {
        omanik = omanikuNimi;
    }

    public void lisaAsi(String value) {
        kott.add(value);
    }

    public void eemaldaAsi(String value) {
        kott.remove(value);
    }

    public String misOnKotis() {
        //System.out.println(kott);
        return kott.toString();
    }

    public String mituAsjaOnKotis() {
        //System.out.println(kott.size());
        return Integer.toString(kott.size());
    }

    public String omanikuNimi() {
        //System.out.println(omanikuNimi);
        return omanik;
    }

    public void rebene() {
        kott.clear();
    }
}
