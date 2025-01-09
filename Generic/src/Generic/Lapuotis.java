package Generic;

public interface Lapuotis extends Medis{
    @Override
    default void turi() {
        System.out.println(getClass().getSimpleName() + " turi lapus.");
    }
}
