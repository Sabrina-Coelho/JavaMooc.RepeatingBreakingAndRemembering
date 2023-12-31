
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int numberOfNumbers = 0;
        double average = 0;
        int even = 0;
        int odd = 0;
        System.out.println("Give numbers: ");

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }
            if (number != -1 && number % 2 != 0) {
                sum += number;
                numberOfNumbers++;
                average = (double) sum/numberOfNumbers;
                odd++;
                continue;
            }
            if (number != -1 && number % 2 == 0) {
                sum += number;
                numberOfNumbers++;
                average = (double) sum/numberOfNumbers;
                even++;
                continue;
            }
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numberOfNumbers);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}

