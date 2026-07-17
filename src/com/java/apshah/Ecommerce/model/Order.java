package com.java.apshah.Ecommerce.model;

public class Order {

    private final String sku;
    private final double amount;
    private String status;


    public Order(String sku,double amount) {

        this.sku=sku;
        this.amount = amount;
        this.status="NEW";
    }



    void processOrder(String status){

        if(this.status.equalsIgnoreCase("NEW") && status.equalsIgnoreCase("PENDING")){
            this.status = "PENDING";
        }


        else if(this.status.equalsIgnoreCase("PENDING")&& status.equalsIgnoreCase("PAID")){
            this.status="PAID";
            }
        }



        public String getSku() {
            return sku;
        }

        public double getAmount() {
            return amount;
        }

        public String getStatus() {
            return status;
        }


    }

