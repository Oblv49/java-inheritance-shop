package org.java.lessons.shop;

import java.util.Random;

public class Product {

    //variables declaration
    private String uniqueCode;
    private String name;
    private String marca;
    private double price;
    private double iva;


    //getter & setter
        //get
        public String getName() {
            return name;
        }

        public String getMarca() {
            return marca;
        }
        public double getPrice() {
            return price;
        }
        public double getIva() {
            return iva;
        }
        public String getUniqueCode() {
            return uniqueCode;
        }

        //set
        public void setName(String name) {
            this.name = name;
        }
        public void setMarca(String marca) {
            this.marca = marca;
        }
        public void setPrice(double price) {
            this.price = price;
        }
        public void setIva(double iva) {
            this.iva = iva;
        }

    //CONSTRUCTOR


    public Product(String uniqueCode, String name, String marca, double price, double iva) {
        this.uniqueCode = uniqueCode;
        this.name = name;
        this.marca = marca;
        this.price = price;
        this.iva = iva;
    }

    //METHODS
        //method for full name: name + unique code
        public String fullNameProduct () {
            return uniqueCode + "-" + name;
        }

        //method for calculate price whit IVA
        public double priceWhitIva ( double priceWhitIva){
            return priceWhitIva = price + (price * (iva / 100));
        }


        //PRIVATE METHODS

        private String uniqueCodeGenerator () {
            //creation number random
            Random randomNum = new Random();
            uniqueCode = Integer.toString(randomNum.nextInt(1, 199999999));
            //Check if the length of the random number is less than 9 and if so add "0" on the left until it reaches 9 digits
            while (uniqueCode.length() < 9) {
                uniqueCode = "0" + uniqueCode;
            }
            return uniqueCode;
        }


        //override tostring

    @Override
    public String toString() {
        return "Product{" +
                "uniqueCode='" + uniqueCode + '\'' +
                ", name='" + name + '\'' +
                ", marca='" + marca + '\'' +
                ", price=" + price +
                ", iva=" + iva +
                '}';
    }
}
