    class RentalCars{
    private String brand;
    private String model;
    private boolean availability;

    // Constructor
    public RentalCars(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.availability = true;
    }

    // Method to rent a car
    public void rentCar() {
        if (availability) {
            availability = false;
            System.out.println("You rented a car: " + brand + " its model is: " + model);
        } else {
            System.out.println("Car is already rented");
        }
    }

    // Method to return a rented car
    public void returnCar() {
        if (!availability) {
            availability = true;
            System.out.println("Thank you for returning car Brand: " + brand + " model: " + model);
        }
    }

    // Method to display car information
    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Availability: " + (availability ? "yes":"no"));
    }

    // Main method
    public static void main(String[] args) {
        RentalCars r = new RentalCars("Hyundai", "2023");
        r.display();
        r.rentCar();
        r.rentCar();
        r.returnCar();
    }
}
