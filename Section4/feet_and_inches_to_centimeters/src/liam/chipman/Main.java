package liam.chipman;

public class Main {

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(6, 4));
        System.out.println(calcFeetAndInchesToCentimeters(100));
    }
    public static double calcFeetAndInchesToCentimeters(int feet, int inches){
        if (feet < 0 || inches < 0 || inches > 12){
            return -1;
        }
        double feet_to_centimeters = feet * 30.48;
        double inches_to_centimeters = inches * 2.54;
        return (feet_to_centimeters + inches_to_centimeters);
    }
    public static double calcFeetAndInchesToCentimeters(int inches){
        if (inches < 0){
            return -1;
        }
        int feet = inches / 12;
        int remaining_inches = inches % 12;
        return calcFeetAndInchesToCentimeters(feet, remaining_inches);
    }
}
