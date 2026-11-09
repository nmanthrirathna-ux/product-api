package uk.ac.westminster.product_api;

public class DigitalProduct extends Product {
    private String downloadUrl;
    private double fileSizeMB;

    // No-arg constructor required for Jackson JSON deserialization
    public DigitalProduct() {}

    // Full parameterized constructor
    public DigitalProduct(Long id, String name, double price, String downloadUrl, double fileSizeMB) {
        // super(...) MUST be the very first statement
        super(id, name, price);
        this.downloadUrl = downloadUrl;
        this.fileSizeMB = fileSizeMB;
    }

    // Getters for the new fields
    public String getDownloadUrl() {
        return downloadUrl;
    }

    public double getFileSizeMB() {
        return fileSizeMB;
    }
}