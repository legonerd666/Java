package liam.chipman;

public class Main {

    public static void main(String[] args) {
	    double num = 20.00d;
	    double num2 = 80.00d;
	    double total = num + num2;
	    total *= 100.00d;
	    total %= 40.00d;
	    boolean result = (total == 0) ? true : false;
        System.out.println(result);
        if (!result) {
            System.out.println("Got some remainder");
        }
    }
}
