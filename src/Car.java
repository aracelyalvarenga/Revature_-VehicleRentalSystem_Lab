public class Car extends Vehicle {
    private double insurancePerDay;

    public Car(String vehicleNumber, String model, double ratePerDay, int days, double insurancePerDay) {
        super(vehicleNumber, model, ratePerDay, days); 
        this.insurancePerDay = insurancePerDay;
    }

    
    @Override
    public double calculateRent() {
        return (getRatePerDay() + insurancePerDay) * getDays();
    }

    @Override
    public void displayDetails() {
        System.out.println("Car  | " + getVehicleNumber() + " | " + getModel() + " | Days: " + getDays() + " | Rent: " + calculateRent());
    }
}