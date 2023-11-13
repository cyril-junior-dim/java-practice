import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int numbers = 0;
        double avg = 0.0;
        boolean isInt = true;

        while(isInt) {
            try {
                int number = Integer.parseInt(scanner.nextLine());
                sum += number;
                numbers++;
            } catch (NumberFormatException e) {
                isInt = false;
            }

        }

        if(numbers > 0) {

            avg = (double)sum / (double)numbers;
        }

        System.out.printf("SUM = %d AVG = %d", sum, Math.round(avg));

    }
}
