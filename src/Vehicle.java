
public class Vehicle {
		private String vehicleNumber;
		private String model;
		private double ratePerDay;
		private int days;

	public double calculateRent(){
		return ratePerDay * days;
		
	}
	
	public Vehicle(String vehicleNumber, String model, double ratePerDay, int days){
		this.vehicleNumber = vehicleNumber;
		this.model = model;
		this.ratePerDay = ratePerDay;
		this.days = days;
	}
	
	public void displayDetails() {
		System.out.println("Vehicle | " + vehicleNumber + " | " + model + " | Days: " + days + " | Rent: " + calculateRent());
	}
	
	public int getDays() {
		return days;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getVehicleNumber () {
		return vehicleNumber;
	}
	public double getRatePerDay () {
		return ratePerDay;
	}


	

	
	

}
