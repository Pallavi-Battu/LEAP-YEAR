
public class leapyear {
    public static void main(String[] args) {
        int year = 2024;
        boolean isLeap = checkLeapYear(year);
        if (isLeap) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    public static boolean checkLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
