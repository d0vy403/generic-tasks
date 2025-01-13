package Generic5;

public class SuperPair<T1, T2, T3 extends Number>{
    private T1 first;
    private T2 second;
    private T3 third;

    public SuperPair(T1 first, T2 second, T3 third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    @Override
    public String toString() {
        return "SuperPair{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                '}';
    }

    public T1 getFirst() {
        return first;
    }

    public void setFirst(T1 first) {
        this.first = first;
    }

    public T2 getSecond() {
        return second;
    }

    public void setSecond(T2 second) {
        this.second = second;
    }

    public T3 getThird() {
        return third;
    }

    public void setThird(T3 third) {
        this.third = third;
    }
}
