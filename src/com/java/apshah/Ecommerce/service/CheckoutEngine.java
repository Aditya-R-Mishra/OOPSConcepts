package com.java.apshah.Ecommerce.service;

import com.java.apshah.Ecommerce.model.CreditCardPayment;
import com.java.apshah.Ecommerce.model.Order;

import com.java.apshah.Ecommerce.model.UPIPayment;

public class CheckoutEngine {

    UPIPayment up;
    CreditCardPayment cp;

    public CheckoutEngine(UPIPayment up, CreditCardPayment cp){
        this.up=up;
        this.cp=cp;

    }

    public void Checkout(Order o, String paymentMethod){

        if(paymentMethod.equalsIgnoreCase("UPI")){
            up.authorizeAndHoldUPI(o);
            up.captureUPI(o);}

        else if(paymentMethod.equalsIgnoreCase("CreditCard")){
            cp.authourizeAndHoldCreditCard(o);
            cp.authorizeAndHoldCreditCard(o);
        }
    }

    public void checkout(Order o, String upi) {
            
    }
}
