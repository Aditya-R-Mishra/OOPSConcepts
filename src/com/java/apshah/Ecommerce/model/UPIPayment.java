package com.java.apshah.Ecommerce.model;

public class UPIPayment {

    public void authorizeAndHoldUPI(Order o){
        System.out.println("Contacting UPI payment gateway");

        System.out.println("Authorizing and contacting : "+o.getAmount());
        o.processOrder("PENDING");

    }

    public void captureUPI(Order o){
        System.out.println("Transferring payment from UPI");
        o.processOrder("PAID");

    }
}
