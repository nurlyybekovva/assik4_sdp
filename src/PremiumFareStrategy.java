public class PremiumFareStrategy implements FareStrategy{
    double rate_per_dist = 2.00;
    double rate_per_min = 0.50;
    @Override
    public double calculateFare(double distance, double time) {
        return (rate_per_dist * distance + rate_per_min * time);
    }
}