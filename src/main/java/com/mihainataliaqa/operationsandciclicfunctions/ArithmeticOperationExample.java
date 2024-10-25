package com.mihainataliaqa.operationsandciclicfunctions;

public class ArithmeticOperationExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        //Adunare
        int sum = a + b;
        System.out.println("Suma: " + sum); //10+5=15

        //Scadere
        int difference = a - b;
        System.out.println("Diferenta: " + difference); //10-5=5

        //Inmultire
        int product = a * b;
        System.out.println("Produsul: " + product); //10*5=50

        //Impartire
        int division = a / b;
        System.out.println("Impartirea: " + division); //10/5=2

        //Restul impartirii
        int remainder = a % b;
        System.out.println("Restul impartirii: " + remainder); //10/5=0  (12/5=2)

        ///////////////////////////////////////////////////////////////

        a = 43;
        b = 3;

        //Summ
        sum = a + b;
        System.out.println("Suma: " + sum); //46

        //Substraction
         difference = a - b;
        System.out.println("Diferenta: " + difference); //43

        //Multiplication
         product = a * b;
        System.out.println("Produsul: " + product); //129

        //Devision
         division = a / b;
        System.out.println("Impartirea: " + division); //14

        //The rest of devision
         remainder = a % b;
        System.out.println("Restul impartirii: " + remainder); //1


    }
}
