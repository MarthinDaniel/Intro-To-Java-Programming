public class Exercise01_12 {
    private static double milesPerHour(double miles, double minutes){
        return 60 * (miles/minutes);
    }
    private static double kmPerHour(double mph){
        return mph * 1.6;
    }
    public static void main(String[] args) {
        System.out.println("Km per hour = " + kmPerHour(milesPerHour(24, 100.58)));
    }
}
