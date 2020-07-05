package liam.chipman;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(0 , 0));

        System.out.println(getDurationString(1800 , 42));
    }
    public static String getDurationString(int minutes, int seconds){
        if (minutes <= 0 && seconds <= 0){
            return "Invalid Value";
        }
        minutes += seconds / 60;
        int remaining_seconds = seconds % 60;
        int hours = minutes / 60;
        int remaining_minutes = minutes % 60;
        return hours + "h " + remaining_minutes + "m " + remaining_seconds + "s";
    }
    public static String getDurationString(int seconds){
        if (seconds < 0){
            return "Invalid Value";
        }
        int minutes = seconds / 60;
        int remaining_seconds = seconds % 60;
        return getDurationString(minutes, remaining_seconds);
    }
}
