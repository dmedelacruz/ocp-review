package chapter1;

public class TextBlocks1 {

    private int numForks;

    public static void main(String... args) {
        int numKnives;
        System.out.print("""
           "# forks = " + numForks +
            " # knives = " + numKnives +
           # cups = 0""");
    }

}
