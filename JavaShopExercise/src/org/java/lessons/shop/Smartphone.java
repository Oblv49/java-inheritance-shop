package org.java.lessons.shop;

public class Smartphone extends Product {

    //variables declaration
    private String codIMEI;
    private String memory;

    //getter & setter
        //get
        public String getCodIMEI() {
            return codIMEI;
        }

        public String getMemory() {
            return memory;
        }
        //set
        public void setMemory(String memory) {
            this.memory = memory;
        }

        //constructor

    public Smartphone(String uniqueCode, String name, String marca, double price, double iva, String codIMEI, String memory) {
        super(uniqueCode, name, marca, price, iva);
        this.codIMEI = codIMEI;
        this.memory = memory;
    }
}
