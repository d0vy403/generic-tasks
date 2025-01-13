package Generic4;

import java.util.ArrayList;
import java.util.List;

public class ListOfNumbers {
    List<Double> doubleList = new ArrayList<>();

    public void addNumber(Double number) {
        doubleList.add(number);
    }

    public double getAverage() {

        if (doubleList.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (double num : doubleList) {
            sum += num;
        }
        return sum / doubleList.size();
    }

    @Override
    public String toString() {
        return "ListOfNumbers{" +
                "doubleList=" + doubleList +
                '}';
    }
}

