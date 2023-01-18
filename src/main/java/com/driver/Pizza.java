package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int total;
    private boolean extracheese=false;
    private boolean extratoppings=false;
    private boolean takeaway=false;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg==true){
            price=300;
            total+=price;
        }
        else{
            price=400;
            total+=price;
        }
    }

    public int getPrice(){
        return this.price;
    }
    public void setPrice(int price){
        this.price=price;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void addExtraCheese(){
        if(extracheese==false) {
            total += 80;
            extracheese=true;
        }
    }

    public void addExtraToppings(){
        if(extratoppings==false) {
            if (isVeg == true) {
                total += 70;
            } else {
                total += 120;
            }
            extratoppings=true;
        }
    }

    public void addTakeaway(){
        if(takeaway==false) {
            total += 20;
            takeaway=true;
        }
    }

    public String getBill(){
        bill="Base Price Of The Pizza: "+price;
        if(extracheese==true){
            bill+="\nExtra Cheese Added: "+80;
        }
        if(extratoppings==true){
            if(isVeg==true){
                bill+="\nExtra Toppings Added: "+70;
            }
            else{
                bill+="\nExtra Toppings Added: "+120;
            }
        }
        if(takeaway==true){
            bill+="\nPaperbag Added: "+20;
        }
        bill+="\nTotal Price: "+total;
        return this.bill;
    }
}
