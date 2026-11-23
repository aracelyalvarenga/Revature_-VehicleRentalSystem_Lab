import java.util.Scanner;

public class RentalApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vehicles: ");
        int n = Integer.parseInt(sc.nextLine().trim());

        
        Vehicle[] vehicles = new Vehicle[n];

        for (int i = 0; i < n; i++) {

            
            int type = 0;
            while (type != 1 && type != 2) {
                System.out.print("Enter type (1-Car, 2-Bike): ");
                try {
                    type = Integer.parseInt(sc.nextLine().trim());
                } catch (NumberFormatException e) {
                    type = 0;
                }
                if (type != 1 && type != 2) {
                    System.out.println("Error: invalid vehicle type. Please enter 1 or 2.");
                }
            }

            System.out.print("Enter Vehicle Number: ");
            String number = sc.nextLine().trim();
            System.out.print("Enter Model: ");
            String model = sc.nextLine().trim();
            System.out.print("Enter Rate per Day: ");
            double rate = Double.parseDouble(sc.nextLine().trim());
            System.out.print("Enter Days: ");
            int days = Integer.parseInt(sc.nextLine().trim());

            Vehicle v; // parent-type reference
            if (type == 1) {
                System.out.print("Enter Insurance per Day: ");
                double insurance = Double.parseDouble(sc.nextLine().trim());
                v = new Car(number, model, rate, days, insurance);
            } else {
                v = new Bike(number, model, rate, days);
            }
            vehicles[i] = v;
        }

        System.out.println("--- Rental Details ---");
        double total = 0;
        for (Vehicle v : vehicles) {
            v.displayDetails();         
            total += v.calculateRent(); 
        }
        System.out.println("Total Rent Collected: " + total);

        sc.close();
    }
}