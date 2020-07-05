package liam.chipman;

public class Main {

    public static void main(String[] args) {

    }
    public static boolean isCatPlaying(boolean is_summer, int temperature) {
        if (is_summer && temperature >= 25 && temperature <= 45){
            return true;
        }
        else return !is_summer && temperature >= 25 && temperature <= 35;
    }


}
