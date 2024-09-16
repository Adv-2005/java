package lab8;

import java.util.Scanner;

public class CurrentDate {
    private int day;
    private int month;
    private int year;

    public CurrentDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public static CurrentDate createDate() throws InvalidDayException, InvalidMonthException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day: ");
        int day = scanner.nextInt();

        System.out.print("Enter month: ");
        int month = scanner.nextInt();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        if (month < 1 || month > 12) {
            throw new InvalidMonthException("Invalid month: " + month);
        }

        if (day < 1 || day > 31) {
            throw new InvalidDayException("Invalid day: " + day);
        }

        // Additional checks for days in specific months can be added here

        return new CurrentDate(day, month, year);
    }

    @Override
    public String toString() {
        return "CurrentDate{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
   
    
    }
    public static void main(String[] args) {
        try {
            CurrentDate date = CurrentDate.createDate();
            System.out.println("Date created successfully: " + date);
        } catch (InvalidDayException | InvalidMonthException e) {
            System.out.println(e.getMessage());
        }
    }
}
