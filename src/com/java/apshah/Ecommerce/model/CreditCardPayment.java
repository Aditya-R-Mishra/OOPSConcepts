package com.java.apshah.Ecommerce.model;

public class CreditCardPayment {
    public void authourizeAndHoldCreditCard(Order o){
        System.out.println("Contacting CreditCard paymenr gateway");

        System.out.println("Authorizing and contacting : "+o.getAmount());
        o.processOrder("PENDING");
    }
    
    public void captureCreditCard(Order o){
        System.out.println("Transfering payment from CreditCard");
        o.processOrder("PAID");
    }

    public void authorizeAndHoldCreditCard(Order o) {

    }
}
