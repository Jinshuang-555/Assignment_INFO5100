package Assignment6.Q2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DrivingLicenseApplication {
    public static void main(String[] args) throws DateException {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Year :");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Month : ");
        int month = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Day : ");
        int day = scanner.nextInt();

        LocalDate date = LocalDate.of(year, month, day);
        LocalDate now = LocalDate.now();

        int months = (int) ChronoUnit.MONTHS.between(date,now);
        try {
            checkIfEligible(months);
        } catch (DateException e) {
            e.printStackTrace();
        }
    }
    public static void checkIfEligible(int months) throws DateException {
        if (months < 192) {
            throw new DateException(months);
        }
    }
}
