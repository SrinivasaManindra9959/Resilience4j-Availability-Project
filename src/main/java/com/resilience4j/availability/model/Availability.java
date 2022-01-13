package com.resilience4j.availability.model;

import lombok.Data;

@Data
public class Availability {
    public String orderName;
    public Integer orderId;
    public String productName;

    public String getOrderName() {
        return orderName;    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
