
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number: ");
        int input1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number: ");
        int input2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the third number: ");
        int input3 = Integer.parseInt(scanner.nextLine());
        double average = 1.0 * (input1+input2+input3) / 3;
        System.out.println("The average is " + average);
    }
}
