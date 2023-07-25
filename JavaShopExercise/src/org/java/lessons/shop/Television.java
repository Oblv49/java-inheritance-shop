package org.java.lessons.shop;

import java.util.Arrays;

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
    public Television(String uniqueCode, String name, String marca, double price, double iva, String inchTV, boolean isSmartTv) {
        super(uniqueCode, name, marca, price, iva);
        this.inchTV = inchTV;
        this.isSmartTv = isSmartTv;
    }

    //methods
    public boolean isSmartTv(String chooseUser) {
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

    //choose inch tv
    public String inchTvChoose(String chooseUser) {
        switch (chooseUser) {
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
                System.out.println("Invalid choice. The basic choose is 32");
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
