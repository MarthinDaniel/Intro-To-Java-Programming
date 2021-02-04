import java.util.GregorianCalendar;

public class Exercise09_05{
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        System.out.print("\nCurrent year, month, and day in format Month/Day/Year: ");
        System.out.println(calendar.get(calendar.MONTH) + "/" + calendar.get(calendar.DAY_OF_MONTH) + "/" + calendar.get(calendar.YEAR));
        calendar.setTimeInMillis(1234567898765L);
        System.out.println("\nElapse time since January 1, 1970 set to " + "1234567898765L in format Mth/Day/Year: ");
        System.out.println(calendar.get(calendar.MONTH) + "/" + calendar.get(calendar.DAY_OF_MONTH) + "/" + calendar.get(calendar.YEAR));
    }
}