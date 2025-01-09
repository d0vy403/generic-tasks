package Generic;

import java.util.List;

public class Miskas {
    public static void ivairusMiskas(List<? extends Medis> medziai) {
        System.out.println("\nĮvairus miškas:");
        for (Medis medis : medziai) {
            medis.turi();

        }
    }
    public static void spygliuociuMiskas(List<? extends Medis> medziai) {
        System.out.println("\nSpygliuočių miškas:");
        for (Medis medis : medziai) {
            if (medis instanceof Kadagys || medis instanceof Egle || medis instanceof Pusis) {
                medis.turi();
            }
        }
    }

    public static void berzuMiskas(List<? extends Berzas> medziai) {
        System.out.println("\nBeržų miškas:");
        for (Berzas medis : medziai) {
            medis.turi();
        }
    }
}
