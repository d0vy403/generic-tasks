package Generic4;

public class Main {
    public static void main(String[] args) {
        ListOfNumbers list1 = new ListOfNumbers();
        list1.addNumber(12.0);
        list1.addNumber(100.5);
        list1.addNumber(2.3);

        ListOfNumbers list2 = new ListOfNumbers();
        list2.addNumber(50.7);
        list2.addNumber(6.7);

        ListOfNumbers result = MaxAverage.findMaxAverage(list1, list2);
        System.out.println("List with max average: " + result);

    }
}
