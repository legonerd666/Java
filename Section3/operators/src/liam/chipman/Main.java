package liam.chipman;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println(result);
        int previous_result = result;
        System.out.println(previous_result);
        result = result - 1;
        System.out.println(result);
        result = result * 10;
        System.out.println(result);
        result = result / 5;
        System.out.println(result);
        result = result % 3;
        System.out.println(result);
        result++;
        System.out.println(result);
        result--;
        System.out.println(result);
        result += 2;
        System.out.println(result);
        result *= 10;
        System.out.println(result);
        result /= 3;
        System.out.println(result);
        result -= 2;
        System.out.println(result);

        boolean is_alien = false;
        if (!is_alien) {
            System.out.println("It aint an alien");
        }

        int top_score = 80;
        if (top_score < 100) {
            System.out.println("You got the highest score");
        }
        int second_top_score = 95;
        if ((top_score > second_top_score) && (top_score < 100)){
            System.out.println("Greater than second top score and less than 100");
        }

        if ((top_score > 90) || (second_top_score <= 90)){
            System.out.println("Either or both of the conditions are true");
        }

        int new_value = 50;
        if (new_value == 50){
            System.out.println("Sup");
        }

        boolean is_car = false;
        if (is_car){
            System.out.println("Sup again");
        }

        boolean was_car = is_car ? true : false;
        if (was_car){
            System.out.println("was_car is true");
        }

    }
}
