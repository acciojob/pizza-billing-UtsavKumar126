package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        if(isVeg==true){
            setPrice(450);
            setTotal(450);
        }
        else{
            setPrice(600);
            setTotal(600);
        }
    }
}
