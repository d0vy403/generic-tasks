package Generic;

public interface Spygliuotis extends Medis{
    @Override
    default void turi() {
        System.out.println(getClass().getSimpleName() + " turi spyglius.");
    }
}
