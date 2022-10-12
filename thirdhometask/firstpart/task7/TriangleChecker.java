package thirdhometask.firstpart.task7;

public class TriangleChecker {
    public static boolean isPossibleToCreateTriangle(double a, double b, double c) {
        if ((a <= 0) || (b <= 0) || (c <= 0)) {
            throw new IllegalArgumentException("Length side of triangle should be positive number!");
        }
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}
