package liam.chipman;

public class Main {

    public static void main(String[] args) {

        byte my_byte = 50;
        short my_short = 30000;
        int my_int = 200000000;
        long my_long = 50000L + 10L * (my_byte + my_short + my_int);

        System.out.println(my_long);

    }
}
