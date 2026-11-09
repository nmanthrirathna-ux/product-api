package uk.ac.westminster.product_api;

public class PhysicalProduct extends Product implements Discountable {
    private double weightKg;
    private String dimensions;
    private double discountedPrice;

    public PhysicalProduct() {}

    public PhysicalProduct(Long id, String name, double price, double weightKg, String dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
        this.discountedPrice = price; // Initial price before discount
    }

    @Override
    public String getSummary() {
        return "Physical: " + getName() + " | Weight: " + weightKg + "kg";
    }

    @Override
    public void applyDiscount(double rate) {
        // Cap the rate at 20% because shipping is never discounted
        double cappedRate = Math.min(rate, 0.20);
        this.discountedPrice = getPrice() * (1 - cappedRate);
    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }
}