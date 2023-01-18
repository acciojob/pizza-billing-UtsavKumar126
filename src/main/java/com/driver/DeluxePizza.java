package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);

        if(isVeg==true){
         setPrice(300);
         setTotal(300);
         addExtraCheese();
         addExtraToppings();
        }
        else{
            setPrice(400);
            setTotal(400);
            addExtraCheese();
            addExtraToppings();
        }
    }
}
