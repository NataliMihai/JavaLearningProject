package com.mihainataliaqa.operationsandciclicfunctions;

public class IncrementDecrementExample {
    public static void main(String[] args) {
        int a = 5;

        //Incrementare
        a++; //a=a+1=6
        System.out.println("Valoare dupa incrementare: " + a);

        //Incrementare pre-fixata
        ++a; //a=7
        int b = ++a; //b = 8; a= 8

        int a1 = a; //a1=8;
        int c = a++; // c=8; a=9;
        System.out.println("Valoare dupa incrementare pre-fixata: " + a); //a=9;
        System.out.println("Afiseaza b = " + b + ", a1 = " + a1 + ", c = " + c + ", a = " + a);
        // Afiseaza b = 8, a1 = 8, c = 8, a = 9

        System.out.println();

        //Decrementare
        int d = a--; //a = a-1 = 9-1=8
        System.out.println("Valoare dupa decrementare: " + a); //8
        System.out.println("Afiseaza d = " + d + ", a = " + a); //d=9; a=8;

        //Decrementare pre-fixata
        int f = --a; //f = 7; a= 7
        System.out.println("Valoare dupa decrementare pre-fixata: " + a); //7
        System.out.println("Afiseaza f = " + f + ", a = " + a);  //f = 7; a= 7


    }
}
