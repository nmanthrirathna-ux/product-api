package uk.ac.westminster.product_api;

public class PhysicalProduct extends Product {
    private double weightKg;
    private String dimensions;

    // No-arg constructor required for Jackson JSON deserialization
    public PhysicalProduct() {}

    // Full parameterized constructor
    public PhysicalProduct(Long id, String name, double price, double weightKg, String dimensions) {
        // super(...) MUST be the very first statement
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    // Getters for the new fields
    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }
}