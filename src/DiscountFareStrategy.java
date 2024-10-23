public class DiscountFareStrategy implements FareStrategy{
    double rate_per_dist = 0.80;
    double rate_per_min = 0.20;
    @Override
    public double calculateFare(double distance, double time) {
        return (rate_per_dist * distance + rate_per_min * time);
    }
}
