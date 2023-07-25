package org.java.lessons.shop;

import java.math.BigInteger;
import java.util.Random;

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

    //private methods
    private String codIMEIGenerator() {
            //max lim variables
        BigInteger maxLimit = new BigInteger("999999999999999");
            //random variables
        Random random = new Random();
            //creation numRandom
        BigInteger randomNum = new BigInteger(maxLimit.bitLength(), random);
        while (randomNum.compareTo(maxLimit) > 0) {
            randomNum = new BigInteger(maxLimit.bitLength(), random);
        }
        // conversion to string and add 0 to sx
        String codIMEI = randomNum.toString();
        while (codIMEI.length() < 15) {
            codIMEI = "0" + codIMEI;
        }
        return codIMEI;
    }



}

