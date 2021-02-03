import java.util.Scanner;
public class Exercise02_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time zone off set to GMT: ");
        int offset = input.nextInt();

        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        currentHour = currentHour + offset;
        System.out.println("Current time is " + currentHour + ":"+ currentMinute + ":" + currentSeconds);
        input.close();
    }
}
