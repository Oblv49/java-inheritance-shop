package org.java.lessons.shop;

public class Headphone extends Product {

    //variables declaration
    private String color;
    private Boolean isWireless;

    //getter & setter
        //get
        public String getColor() {
            return color;
        }
        public Boolean getWireless() {
            return isWireless;
        }
        //set
        public void setColor(String color) {
            this.color = color;
        }


    //constructor
    public Headphone(String uniqueCode, String name, String marca, double price, double iva, String color, Boolean isWireless) {
        super(uniqueCode, name, marca, price, iva);
        this.color = color;
        this.isWireless = isWireless;
    }
}
