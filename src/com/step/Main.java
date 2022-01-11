package com.step;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[1000];

        int move;
        double sum = 0.0;
        products[0] = new Product();
        products[0].setName("TV 43 \" UE43AU9000UXUA");
        products[0].setPrice(9349.0);
        products[0].setProducer("Samsung");
        products[1] = new Product();
        products[1].setName("TV 65 \" UE43AU9000UXUA");
        products[1].setPrice(16999.0);
        products[1].setProducer("Samsung");
        products[2] = new Product();
        products[2].setName("TV 55\" 55A7100F");
        products[2].setPrice(8999.0);
        products[2].setProducer("Hisense");
        products[3] = new Product();
        products[3].setName("TV 74.6\" 55A7100F");
        products[3].setPrice(16999.0);
        products[3].setProducer("Hisense");
        products[4] = new Product();
        products[4].setName("TV 50\" 50NANO776PA");
        products[4].setPrice(10999.0);
        products[4].setProducer("LG");

        while (true) {
            System.out.println();
            System.out.println("Product Store Menu");
            System.out.println("1. Product Info");
            System.out.println("2. Total Price");
            System.out.println("3. EXIT");
            System.out.println();

            move = sc.nextInt();
            sc.nextLine();

            switch (move) {
                case 1:
                    for (int i = 0; i < 5; i++) {
                        System.out.println();
                        System.out.print("Product name: " + products[i].getName() + ", ");
                        System.out.print("Product producer: " + products[i].getProducer() + ", ");
                        System.out.print("Product price: " + products[i].getPrice());
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 0; i < 5; i++) {
                        sum += products[i].getPrice();
                    }
                    System.out.println("Products full price = " + sum);
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Enter only '1', '2' or '3' !! ");
            }
        }
    }
}
