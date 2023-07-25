package org.java.lessons.shop;

import java.util.Scanner;

public class Television extends Product {
    //declaration variables
    private String inchTV;
    private String[] inchTvOptions = new String[]{"32\"", "43\"", "55\"", "65\""};
    private boolean isSmartTv;

    //getter & setter
        //get
        public String getInchTV() {
            return inchTV;
        }
        public boolean getIsSmarTv() {
            return isSmartTv;
        }
        //set
        public void setInchTV(String inchTV) {
            this.inchTV = inchTV;
        }

    //constructor


    public Television() {
        super();
    }

    public Television(String name, String merch, double price, double iva, String inchTV, boolean isSmartTv) {
        super(name, merch, price, iva);
        this.inchTV = inchTV;
        this.isSmartTv = isSmartTv;
    }

    //methods
    public boolean isSmartTv(String chooseUser, Scanner input) {
        System.out.println("Scegli se vuoi una TV Smart o No: ");
        System.out.println("1. Si");
        System.out.println("2. No");
        chooseUser = input.nextLine();
            switch (chooseUser) {
            case "1":
                isSmartTv = true;
                break;
            case "2":
                isSmartTv = false;
                break;
            default:
                System.out.println("Invalid choice.");
                isSmartTv = false;
        }
        return isSmartTv;
    }

    public String setTelevisionBrand(String userChoose, Scanner input) {
        String brand = merchChoose(userChoose, input);
        setMarca(brand);
        return brand;
    }

    //choose inch tv
    public String inchTvChoose(String userChoose, Scanner input) {
        System.out.println("Inserisci un numero da 1 a 4 per scegliere i pollici della tua TV");
        for (int i = 0; i < inchTvOptions.length; i++) {
            System.out.println((i + 1) + ". " + inchTvOptions[i]);
        }
        userChoose = input.nextLine();
        switch (userChoose) {
            case "1":
                inchTV = inchTvOptions[0];
                break;
            case "2":
                inchTV = inchTvOptions[1];
                break;
            case "3":
                inchTV = inchTvOptions[2];
                break;
            case "4":
                inchTV = inchTvOptions[3];
                break;
            default:
                System.out.println("Invalid choice. The basic inch is \"32\"");
                inchTV = inchTvOptions[0];
                break;
        }
        return inchTV;
    }

    //override tostring


    @Override
    public String toString() {
        return "Television{" +
                super.toString() +
                ", inchTV='" + inchTV + '\'' +
                ", isSmartTv=" + isSmartTv +
                '}';
    }
}
