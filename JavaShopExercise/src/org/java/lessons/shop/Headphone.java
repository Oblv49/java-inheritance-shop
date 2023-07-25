package org.java.lessons.shop;

import java.util.Arrays;
import java.util.Scanner;

public class Headphone extends Product {

    //variables declaration
    private String color;
    private String[] colorOptions = new String[] {"Black", "Red", "Blue", "Yellow", "Pink", "Orange"};
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


    public Headphone() {
        super();
    }

    public Headphone(String name, String merch, double price, double iva, String color, Boolean isWireless) {
        super(name, merch, price, iva);
        this.color = color;
        this.isWireless = isWireless;
    }


    //methods
    public boolean isWirelessChoose(String chooseUser, Scanner input) {
        System.out.println("Scegli se vuoi delle cuffie Wireless o No: ");
        System.out.println("1. Si");
        System.out.println("2. No");
        chooseUser = input.nextLine();
        switch (chooseUser) {
            case "1":
                isWireless = true;
                break;
            case "2":
                isWireless = false;
                break;
            default:
                System.out.println("Invalid choice.");
                isWireless = false;
        }
        return isWireless;
    }

    //chose color headphone
    public String colorChoose(String userChoose, Scanner input) {
        System.out.println("Inserisci un numero da 1 a 6 per scegliere il colore delle tue Cuffie");
        for (int i = 0; i < colorOptions.length; i++) {
            System.out.println((i + 1) + ". " + colorOptions[i]);
        }
        userChoose = input.nextLine();
        switch (userChoose) {
            case "1":
                color = colorOptions[0];
                break;
            case "2":
                color = colorOptions[1];
                break;
            case "3":
                color = colorOptions[2];
                break;
            case "4":
                color = colorOptions[3];
                break;
            case "5":
                color = colorOptions[4];
                break;
            case "6":
                color = colorOptions[5];
                break;
            default:
                System.out.println("Invalid choice. The basic inch is \"Black\"");
                color = colorOptions[0];
                break;
        }
        return color;
    }


    //override tostring

    @Override
    public String toString() {
        return "Headphone{" +
                super.toString() +
                "color='" + color + '\'' +
                ", isWireless=" + isWireless +
                '}';
    }
}
