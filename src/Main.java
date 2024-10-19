public class Main {
    public static void main(String[] args) {
        RideContext ride = new RideContext();

        ride.setFareStrategy(new RegularFareStrategy());
        System.out.println("Regular fare: $" + ride.calculateFare(4.5, 10, false));
        System.out.println("Surge fare(peak hours): $" + ride.calculateFare(4.5, 10, true));

        ride.setFareStrategy(new PremiumFareStrategy());
        System.out.println("Premium fare: $" + ride.calculateFare(4.5, 10, false));

        ride.setFareStrategy(new DiscountFareStrategy());
        System.out.println("Discount fare: $" + ride.calculateFare(4.5, 10, false));
    }
}