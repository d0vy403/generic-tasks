package Generic3;

import java.util.ArrayList;
import java.util.List;

public class Mapas<K, V> {
    List<Pora<K, V>> sarasasPoru = new ArrayList<>();

    public void ideti (Pora<K, V> pora) {
        sarasasPoru.add(pora);
    }

    public V gauti(K raktas) {
        for (Pora<K, V> pora : sarasasPoru) {
            if (pora.getRaktas().equals(raktas)) {
                return pora.getReiksme();
            }
        }
        throw new RuntimeException("Raktas nerastas: " + raktas);
    }
}
