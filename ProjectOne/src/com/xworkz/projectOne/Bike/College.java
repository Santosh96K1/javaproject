class VehicleDemo {
    
    String type;
    String model;
    int year;
    String color;
    double price;

    VehicleDemo(String type, String model, int year, String color, double price) {
        this.type = type;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    public static void main(String[] args) {
        VehicleDemo vehicle1 = new VehicleDemo("Car", "Tesla Model S", 2023, "Red", 79999.99);
        System.out.println("Vehicle 1 Type (Literal): " + vehicle1.type);
        System.out.println("Vehicle 1 Model (Literal): " + vehicle1.model);
        System.out.println("Vehicle 1 Year (Literal): " + vehicle1.year);
        System.out.println("Vehicle 1 Color (Literal): " + vehicle1.color);
        System.out.println("Vehicle 1 Price (Literal): " + vehicle1.price);

        // 2. Using Reference
        VehicleDemo vehicleRef = vehicle1;
        System.out.println("\nVehicle Ref Type (Reference): " + vehicleRef.type);
        System.out.println("Vehicle Ref Model (Reference): " + vehicleRef.model);
        System.out.println("Vehicle Ref Year (Reference): " + vehicleRef.year);
        System.out.println("Vehicle Ref Color (Reference): " + vehicleRef.color);
        System.out.println("Vehicle Ref Price (Reference): " + vehicleRef.price);

        // Modify the reference object
        vehicleRef.color = "Blue"; // This change affects both `vehicleRef` and `vehicle1`
        System.out.println("\nVehicle 1 Color after Reference change: " + vehicle1.color); // Should print "Blue"
        System.out.println("Vehicle Ref Color after Reference change: " + vehicleRef.color); // Should print "Blue"

        // 3. Using Constructor
        VehicleDemo vehicle2 = new VehicleDemo("Bike", "Yamaha R1", 2022, "Black", 25000.00);
        System.out.println("\nVehicle 2 Type (Constructor): " + vehicle2.type);
        System.out.println("Vehicle 2 Model (Constructor): " + vehicle2.model);
        System.out.println("Vehicle 2 Year (Constructor): " + vehicle2.year);
        System.out.println("Vehicle 2 Color (Constructor): " + vehicle2.color);
        System.out.println("Vehicle 2 Price (Constructor): " + vehicle2.price);
    }
}
