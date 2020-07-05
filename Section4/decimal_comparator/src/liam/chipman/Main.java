package liam.chipman;

public class Main {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        num1 *= 1000;
        num2 *= 1000;
        if ((int) num1 == (int) num2){
            return true;
        }
        return false;
    }
}
