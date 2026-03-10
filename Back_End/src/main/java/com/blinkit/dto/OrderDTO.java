package com.blinkit.dto;

public class OrderDTO {

    private int userId;
    private double totalPrice;

    public OrderDTO() {}

    public OrderDTO(int userId, double totalPrice) {
        this.userId = userId;
        this.totalPrice = totalPrice;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}