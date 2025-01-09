package Generic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Azuolas azuolas = new Azuolas();
        Berzas berzas = new Berzas();
        Egle egle = new Egle();
        Pusis pusis = new Pusis();
        Kadagys kadagys = new Kadagys();

        azuolas.turi();
        berzas.turi();
        egle.turi();
        pusis.turi();
        kadagys.turi();

        System.out.println("----------------------------------------------");

        List<Medis> ivairusMiskas = new ArrayList<>();
        ivairusMiskas.add(new Berzas());
        ivairusMiskas.add(new Azuolas());
        ivairusMiskas.add(new Kadagys());
        ivairusMiskas.add(new Egle());
        ivairusMiskas.add(new Pusis());

        List<Medis> spygliuociuMiskas = new ArrayList<>();
        spygliuociuMiskas.add(new Kadagys());
        spygliuociuMiskas.add(new Egle());
        spygliuociuMiskas.add(new Pusis());

        List<Berzas> berzuMiskas = new ArrayList<>();
        berzuMiskas.add(new Berzas());
        berzuMiskas.add(new Berzas());

        Miskas.ivairusMiskas(ivairusMiskas);
        Miskas.spygliuociuMiskas(spygliuociuMiskas);
        Miskas.berzuMiskas(berzuMiskas);
    }
}

