package liam.chipman;

public class Main {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }
    public static void printMegaBytesAndKiloBytes(int kilo_bytes){
        if (kilo_bytes < 0){
            System.out.println("Invalid Value");
            return;
        }
        int mega_bytes = kilo_bytes / 1024;
        int remaining_kilo_bytes = kilo_bytes % 1024;
        System.out.println(kilo_bytes + " KB = " + mega_bytes + " MB and " + remaining_kilo_bytes + " KB");
    }
}
