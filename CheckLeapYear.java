import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        // year = 365
        // leap_year = 366
        int year;
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count <50) {
            System.out.println("Enter the year to check leap year or not :");
            year = scanner.nextInt();

            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println("The year is the leap year!");
            } else {
                System.out.println("Not the leap year");
            }
            count++;
        }

    }
}
