package com.mihainataliaqa.clasesandobjects.autoservicetask;

public class ManageAutoService {
    public static void main(String[] args) {

        Car car00001 = new Car("Q5", "Audi", "Black");
        Car car00002 = new Car("508", "Peugeot", "Blue");

        System.out.println(car00002.make + " / " + car00002.model + " " + car00002.color);
        System.out.println(car00001.make + " / " + car00001.model + " " + car00001.color);

        Car car00003 = new Car("BMV", "X5", "White", "BOSS 007", 10500);
        Car car00004 = new Car("BMV", "X3", "Yellow", "MUM", 11800);

        Tool tool001 = new Tool("Hammer", 2);
        System.out.println("The name of the tool is: " + tool001.name + " and its weight is: " + tool001.weight + "kg");
        // afisarea adresei de memorie /celula/
        System.out.println(tool001);

        //Utilizam constructor predefinit Garage, el nu are constructori definiti
        Garage garage01 = new Garage();
        System.out.println(garage01.name + " on address " + garage01.address);
        garage01.name = "Auto-Detailing";
        System.out.println(garage01.name + " on address " + garage01.address);
        garage01.address = "Miron Costin 11 A";
        System.out.println(garage01.name + " on address " + garage01.address);

        Worker worker001 = new Worker();
        System.out.println(worker001.name);
        worker001.name = "Daniel";
        worker001.salary = 5000;
        worker001.age = 18;
        System.out.println(worker001.name);
        System.out.println(worker001.age);
        System.out.println(garage01.name);

    }
}
