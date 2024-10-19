public class SurgeFareStrategy implements FareStrategy{
    private static final double rate_per_dist = 2.00;
    private static final double rate_per_min = 0.50;
    @Override
    public double calculateFare(double distance, double time) {
        return (rate_per_dist * distance + rate_per_min * time);
    }
}
