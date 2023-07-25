package org.java.lessons.shop;

import java.util.Random;
import java.util.Scanner;

public class Product {

    //variables declaration
    private String uniqueCode;
    private String name;
    private String merch;

    private String[] merchOptions = new String[] {"Samsung","Sony","Apple","Xiaomi","LG","Panasonic"};
    private double price;
    private double iva;


    //getter & setter
        //get
        public String getName() {
            return name;
        }

        public String getMarca() {
            return merch;
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
            this.merch = marca;
        }
        public void setPrice(double price) {
            this.price = price;
        }
        public void setIva(double iva) {
            this.iva = iva;
        }

    //CONSTRUCTOR
    public Product() {
        this.uniqueCode = uniqueCodeGenerator();
     }
    public Product(String name, String merch, double price, double iva) {
        this.uniqueCode = uniqueCodeGenerator(); // Imposta il valore del uniqueCode utilizzando il metodo uniqueCodeGenerator()
        this.name = name;
        this.merch = merch;
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


        //method for choose merch
        public String merchChoose(String chooseUser, Scanner input) {
            for (int i = 0; i < merchOptions.length; i++) {
                System.out.println((i + 1) + ". " +merchOptions[i]);
            }
            chooseUser = input.nextLine();
            switch (chooseUser) {
                case "1":
                    merch = merchOptions[0];
                    break;
                case "2":
                    merch = merchOptions[1];
                    break;
                case "3":
                    merch = merchOptions[2];
                    break;
                case "4":
                    merch = merchOptions[3];
                    break;
                case "5":
                    merch = merchOptions[4];
                    break;
                case "6":
                    merch = merchOptions[5];
                    break;
                default:
                    System.out.println("Invalid choice. The basic inch is \"Black\"");
                    merch = merchOptions[0];
                    break;
            }
            return merch;
        }

        //method for set merch
        public String setHeadphoneBrand(String userChoose, Scanner input) {
            String brand = merchChoose(userChoose, input);
            setMarca(brand);
            return brand;
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
                ", merch='" + merch + '\'' +
                ", price=" + price +
                ", iva=" + iva +
                '}';
    }
}
