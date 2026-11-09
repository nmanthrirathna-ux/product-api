package uk.ac.westminster.product_api;

public interface Discountable {
    void applyDiscount(double rate);
    double getDiscountedPrice();
}