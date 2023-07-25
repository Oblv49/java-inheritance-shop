package org.java.lessons.shop;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class Smartphone extends Product {

    //variables declaration
    private String codIMEI;
    private String memory;
    private String[] memoryOptions = new String[] {"12gb", "16gb", "32gb", "64gb"};

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


    public Smartphone() {
        super();
    }

    public Smartphone(String name, String merch, double price, double iva, String memory) {
        super(name, merch, price, iva);
        this.codIMEI = codIMEIGenerator();
        this.memory = memory;
    }

    //methods
    public String memoryChoose(String userChoose, Scanner input) {
        System.out.println("Inserisci un numero da 1 a 4 per scegliere la memoria del tuo Smartphone");
        for (int i = 0; i < memoryOptions.length; i++) {
            System.out.println((i + 1) + ". " + memoryOptions[i]);
        }
        userChoose = input.nextLine();
        switch (userChoose) {
            case "1":
                memory = memoryOptions[0];
                break;
            case "2":
                memory = memoryOptions[1];
                break;
            case "3":
                memory = memoryOptions[2];
                break;
            case "4":
                memory = memoryOptions[3];
                break;
            default:
                System.out.println("Invalid choice. The basic memory is \"12gb\"");
                memory = memoryOptions[0];
                break;
        }
        return memory;
    }

    public String setSmartphoneBrand(String userChoose, Scanner input) {
        String brand = merchChoose(userChoose, input);
        setMarca(brand);
        return brand;
    }

    //override tostring


    @Override
    public String toString() {
        return "Smartphone{" +
                super.toString() +
                "codIMEI='" + codIMEI + '\'' +
                ", memory='" + memory + '\'' +
                '}';
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

