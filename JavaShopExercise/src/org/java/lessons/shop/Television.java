package org.java.lessons.shop;

public class Television extends Product {

    private String inchTV;
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
}
