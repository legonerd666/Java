package liam.chipman;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static boolean isTeen(int age){
        if ((age < 13) || (age > 19)) {
            return false;
        }
        return true;
    }
    public static boolean hasTeen(int age1, int age2, int age3){
        boolean teen1 = isTeen(age1);
        boolean teen2 = isTeen(age2);
        boolean teen3 = isTeen(age3);
        if (teen1 || teen2 || teen3){
            return true;
        }
        return false;
    }
}
