package com.mihainataliaqa.operationsandciclicfunctions;

public class LogicalOperationsExample {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;

        boolean result = a && b; //si = true
        System.out.println("Logic and: " + result);  //si = true

        // a = true;
        a = result && b; //
        //a = false
        System.out.println("Logic and: " + a);

        System.out.println();

        // result = false;
        result = a || b; //
        //result = false
        System.out.println("Logic or: " + result);

        System.out.println("Negation : " + !result);

    }
}
