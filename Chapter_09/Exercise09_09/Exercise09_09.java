public class Exercise09_09 {
    public static void main(String[] args) {
        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6,4);
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("\n--------------------------------------------------");
        System.out.println("| Regular Polygon Objects |  Perimeter  |  Area  |");
        System.out.println("--------------------------------------------------");
        System.out.printf( "|       Object# 1         |%8.2f     |%6.2f  |\n", polygon1.getPerimeter(), polygon1.getArea());
        System.out.printf( "|       Object# 2         |%8.2f     |%6.2f  |\n", polygon2.getPerimeter(), polygon2.getArea());
		System.out.printf( "|       Object# 3         |%8.2f     |%6.2f  |\n", polygon3.getPerimeter(), polygon3.getArea());
		System.out.println("--------------------------------------------------");
    }
}
