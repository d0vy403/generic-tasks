package Generic4;

public class MaxAverage {
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
}
