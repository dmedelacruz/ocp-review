package chapter1;

public class Wrappers1 {

    public static void main(String... args) {
        var num1 = Long.parseLong("100"); //returns a primitive long and only accepts String literals
        var num2 = Long.valueOf("100"); //returns a Wrapper Object Long and accepts both primitive long and String literals

        System.out.println(num1 instanceof Long); //Compile Error since num1 is primitive
        System.out.println(num2 instanceof Long); //will return true
    }

}
