package liam.chipman;

public class Main {

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
    }
    public static boolean shouldWakeUp(boolean barking, int hour_of_day){
        if ((hour_of_day < 0) || (hour_of_day > 23)){
            return false;
        }
        else return (barking && (hour_of_day < 8)) || barking && (hour_of_day > 22);
    }
}
