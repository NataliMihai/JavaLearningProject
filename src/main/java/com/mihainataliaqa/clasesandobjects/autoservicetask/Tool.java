package com.mihainataliaqa.clasesandobjects.autoservicetask;

public class Tool {

    String name;
    double price;
    double weight;

    // Cream constructor definit, cu 2 parametri
    public Tool(String nameOfTool, double weight) {
        name = nameOfTool;
        this.weight = weight;

        System.out.println("The tool has been created");

    }
    // Cream constructor definit, cu 3 parametri
    public Tool(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;

    }
}
