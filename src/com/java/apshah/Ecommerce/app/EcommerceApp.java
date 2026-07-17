package com.java.apshah.Ecommerce.app;

import com.java.apshah.Ecommerce.model.CreditCardPayment;
import com.java.apshah.Ecommerce.model.Order;
import com.java.apshah.Ecommerce.model.UPIPayment;
import com.java.apshah.Ecommerce.service.CheckoutEngine;

public class EcommerceApp {

    static void main(String[] args){
        Order o = new Order("AI-345", 8888.88);
        CreditCardPayment cp =new CreditCardPayment();
        UPIPayment up = new UPIPayment();
        CheckoutEngine ce = new CheckoutEngine(up,cp);
        ce.checkout(o, "UPI");
    }
}
