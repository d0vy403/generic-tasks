package Generic5;

public class Main {
    public static void main(String[] args) {
        SuperPair<String, String, Integer> pair1 = new SuperPair<>("Positive", "Test", 1);
        System.out.println("Positive" + pair1);


        /*SuperPair<String, String, String> pair2 = new SuperPair<>("Negative", "Test", "Text");

        SuperPair<String, String, int> pair3 = new SuperPair<>("Negative", "Test", 6);*/
    }
}
