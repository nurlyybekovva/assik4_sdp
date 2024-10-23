public class RegularFareStrategy implements FareStrategy{
    double rate_per_dist = 1.00;
    double rate_per_min = 0.25;
    @Override
    public double calculateFare(double distance, double time) {
        return (rate_per_dist * distance + rate_per_min * time);
    }
}
