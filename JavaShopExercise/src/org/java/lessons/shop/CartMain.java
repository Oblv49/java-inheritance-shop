package org.java.lessons.shop;


import java.util.ArrayList;
import java.util.Scanner;

public class CartMain {
    public static void main(String[] args) {
        //variables declaration
        Scanner input = new Scanner(System.in);
        String name;
        Double price;
        Double iva;
        String merch;
        String userChoose;
        ArrayList<Product> productsList = new ArrayList<>();

        System.out.println("--------Benvenuto nel Nostro SHOP!--------");
        System.out.println("------------------------------------------");

        do {
            System.out.println("Vuoi inserire un prodotto?");
            System.out.println("Inserisci 1: Si");
            System.out.println("Inserisci 2: No");
            userChoose = input.nextLine();
            System.out.println("------------------------------------------");

            switch(userChoose) {
                case "1":
                case "Si":
                    System.out.println("Ok! Scegli che tipo di prodotto vuoi inserendo un Numero Tra 1 e 3:");
                    System.out.println("1. Television");
                    System.out.println("2. Smartphone");
                    System.out.println("3. Headphone");
                    userChoose = input.nextLine();
                    System.out.println("------------------------------------------");

                    //switch type product
                    switch (userChoose) {
                        case "1":
                        case "Television":
                            Television television = new Television();
                            String inchTV;
                            Boolean isSmartTv;
                            System.out.println("Ok! Aggiungiamo al tuo carrello la Tua Televisione!");
                            System.out.println("Inserisci la marca della tua televisione:");
                            merch = television.setTelevisionBrand(userChoose, input);
                            System.out.println("------------------------------------------");
                            System.out.println("Inserisci il nome della tua televisione:");
                            name = input.nextLine();
                            System.out.println("------------------------------------------");
                            System.out.println("Inserisci il PREZZO della tua televisione:");
                            price = input.nextDouble();
                            System.out.println("------------------------------------------");
                            System.out.println("Inserisci l'IVA della tua televisione:");
                            iva = input.nextDouble();
                            System.out.println("------------------------------------------");
                            input.nextLine();
                            inchTV = television.inchTvChoose(userChoose, input);
                            System.out.println("------------------------------------------");
                            isSmartTv = television.isSmartTv(userChoose, input);
                            System.out.println("------------------------------------------");
                            Television television1 = new Television(name, merch, price, iva, inchTV, isSmartTv);
                            System.out.println(television1);
                            productsList.add(television1);
                            System.out.println("------------------------------------------");

                            System.out.println("Vuoi continuare?");
                            System.out.println("1. Si");
                            System.out.println("2. No");
                            userChoose = input.nextLine();
                            break;
                        case "2":
                        case "Smartphone":
                            Smartphone smartphone = new Smartphone();
                            String memory;
                            System.out.println("Ok! Aggiungiamo al tuo carrello il tuo Smartphone!");
                            System.out.println("Inserisci la marca del tuo Smartphone:");
                            merch = smartphone.setSmartphoneBrand(userChoose, input);
                            System.out.println("------------------------------------------");
                            System.out.println("Inserisci il nome del tuo Smartphone:");
                            name = input.nextLine();
                            System.out.println("------------------------------------------");
                            System.out.println("Inserisci il PREZZO del tuo Smartphone:");
                            price = input.nextDouble();
                            System.out.println("------------------------------------------");
                            System.out.println("Inserisci l'IVA del tuo Smartphone:");
                            iva = input.nextDouble();
                            System.out.println("------------------------------------------");
                            input.nextLine();
                            memory = smartphone.memoryChoose(userChoose, input);
                            System.out.println("------------------------------------------");
                            Smartphone smartphone1 = new Smartphone(name, merch, price, iva, memory);
                            System.out.println(smartphone1);
                            productsList.add(smartphone1);
                            System.out.println("------------------------------------------");

                            System.out.println("Vuoi continuare?");
                            System.out.println("1. Si");
                            System.out.println("2. No");
                            userChoose = input.nextLine();
                            break;

                        case "3":
                        case "Headphone":
                            Headphone headphone = new Headphone();
                            String color;
                            Boolean isWireless;
                            System.out.println("Ok! Aggiungiamo al tuo carrello Le tue Cuffie!");
                            System.out.println("Inserisci la marca delle tue Cuffie:");
                            merch = headphone.setHeadphoneBrand(userChoose, input);
                            System.out.println("------------------------------------------");
                            System.out.println("Inserisci il nome delle tue Cuffie:");
                            name = input.nextLine();
                            System.out.println("------------------------------------------");
                            System.out.println("Inserisci il PREZZO delle tue Cuffie:");
                            price = input.nextDouble();
                            System.out.println("------------------------------------------");
                            System.out.println("Inserisci l'IVA delle tue Cuffie:");
                            iva = input.nextDouble();
                            System.out.println("------------------------------------------");
                            input.nextLine();
                            color = headphone.colorChoose(userChoose, input);
                            System.out.println("------------------------------------------");
                            isWireless = headphone.isWirelessChoose(userChoose, input);
                            System.out.println("------------------------------------------");
                            Headphone headphone1 = new Headphone(name, merch, price, iva, color, isWireless);
                            System.out.println(headphone1);
                            productsList.add(headphone1);
                            System.out.println("------------------------------------------");

                            System.out.println("Vuoi continuare?");
                            System.out.println("1. Si");
                            System.out.println("2. No");
                            userChoose = input.nextLine();
                            break;

                    }
                    break;
                    //switch close


                case "2":
                case "No":
                    System.out.println("Ok, A presto!");
                    break;

            }

        } while(userChoose.equals("1") || userChoose.equals("Si"));

        System.out.println("------------------------------------------");

        if (productsList.size() > 0) {
            // Stampa tutti i prodotti nel carrello
            System.out.println("Ecco i prodotti nel tuo carrello: ");
            for (int i = 0; i < productsList.size(); i++) {
                System.out.println((i + 1) + ". " + productsList.get(i).toString());
            }

            System.out.println("------------------------------------------");
            System.out.println("Cosa desideri fare adesso?");
            System.out.println("1. Vedere il totale con IVA");
            System.out.println("2. Vedere il totale senza IVA");
            userChoose = input.nextLine();

            if (userChoose.equals("1")) {
                double totalPriceWithIva = 0;
                for (int i = 0; i < productsList.size(); i++) {
                    Product product = productsList.get(i);
                    totalPriceWithIva += product.priceWhitIva(product.getPrice());
                    System.out.println("Prodotto " + (i + 1) + ": " + product.getName() + " Prezzo prodotto con IVA: " + product.priceWhitIva(product.getPrice()) + "€");
                }

                // Mostra il prezzo totale con IVA di tutti i prodotti
                System.out.println("------------------------------------------");
                System.out.println("Prezzo totale con IVA: " + totalPriceWithIva + "€");

            } else if (userChoose.equals("2")) {

                double totalPrice = 0;
                for (int i = 0; i < productsList.size(); i++) {
                    Product product = productsList.get(i);
                    double priceWithoutIva = product.getPrice();
                    totalPrice += priceWithoutIva;

                    System.out.println("Prodotto " + (i + 1) + ": " + product.getName() + " Prezzo prodotto senza IVA: " + priceWithoutIva + "€");

                }

                System.out.println("------------------------------------------");
                System.out.println("Prezzo totale senza IVA di tutti i prodotti: " + totalPrice +"€");
                System.out.println("------------------------------------------");
                System.out.println(" ");
                System.out.println("Ciao, a Presto!");
            }

        } else {
            System.out.println("Ciao, a presto!");
        }

    }
}
