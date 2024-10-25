package com.mihainataliaqa.operationsandciclicfunctions;

public class AssignmentOperationsExample {
    public static void main(String[] args) {
        int a = 8;
        int b = 4;

        //Atribuire simpla
        int result = a;
        System.out.println("Atribuire simpla: " + result); //8

        //Atribuire cu adunare
        //result = result + b;
        result += b;
        System.out.println("Atribuire cu adunare: " + result); //8+4=12

        //Atribuire cu scadere
        //result = result - b;
        result -= b;
        System.out.println("Atribuire cu scadere: " + result); //12-4=8

        //Atribuire cu inmultire
        result = result * b;
        System.out.println("Atribuire cu inmultire: " + result); //8*4=32

        //Atribuire cu impartire
        result = result / b;
        System.out.println("Atribuire cu impartire: " + result); //32/4=8

        //Atribuire cu restul impartirii
        result = result % b;
        System.out.println("Atribuire cu restul impartirii: " + result); //8/4=0  (12/5=2)
    }
}
