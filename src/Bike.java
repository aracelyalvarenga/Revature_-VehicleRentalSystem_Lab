public class Bike extends Vehicle {

    public Bike(String vehicleNumber, String model, double ratePerDay, int days) {
        super(vehicleNumber, model, ratePerDay, days);

    @Override
    public double calculateRent() {
        return super.calculateRent() * 0.90;
    }

    @Override
    public void displayDetails() {
        System.out.println("Bike | " + getVehicleNumber() + " | " + getModel() + " | Days: " + getDays() + " | Rent: " + calculateRent());
    }
}