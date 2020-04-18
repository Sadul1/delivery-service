package com.sliit.mtit.microservice.deliveryservice.dto;

public class DeliveyRequest {

    private String address;
    private String fullName;
    private String orderPrice;
    private String mobile;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(String orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "DeliveyRequest{" +
                "address='" + address + '\'' +
                ", fullName='" + fullName + '\'' +
                ", orderPrice='" + orderPrice + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
