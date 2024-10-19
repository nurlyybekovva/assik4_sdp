public class RideContext {
    private FareStrategy fareStrategy;
    public void setFareStrategy(FareStrategy fareStrategy){
        this.fareStrategy = fareStrategy;
    }

    public double calculateFare(double distance, double time, boolean peak_hour){
        if (distance < 0 || time < 0){
            throw new IllegalArgumentException("Distance and time can't be negative.");
        }

        if(peak_hour){
            fareStrategy = new SurgeFareStrategy();
        }
        double fare = fareStrategy.calculateFare(distance, time);
        double minimumFare = 4.59;

        return Math.max(fare, minimumFare);
    }
}
