package Generic4;

import java.util.ArrayList;
import java.util.List;

public class ListOfNumbers {
    List<Double> doubleList = new ArrayList<>();

    public void addNumber(Double number) {
        doubleList.add(number);
    }

    public double getAverage() {
        double sum = 0;
        if (doubleList.isEmpty()) {
            return sum;
        }

        for (double num : doubleList) {
            sum += num;
        }
        return sum / doubleList.size();
    }

    public static ListOfNumbers findMaxAverage(ListOfNumbers... lists) {
        double maxAverage = Double.NEGATIVE_INFINITY;
        ListOfNumbers maxList = null;

        for (ListOfNumbers list : lists) {
            double currentAverage = list.getAverage();
            if (currentAverage > maxAverage) {
                maxAverage = currentAverage;
                maxList = list;
            }
        }
        return maxList;
    }

    @Override
    public String toString() {
        return "ListOfNumbers{" +
                "doubleList=" + doubleList +
                '}';
    }
}

