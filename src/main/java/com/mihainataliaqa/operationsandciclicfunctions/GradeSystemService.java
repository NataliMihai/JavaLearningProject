package com.mihainataliaqa.operationsandciclicfunctions;

public class GradeSystemService {
    public static void main(String[] args) {

        int testResult = 98;

        if (testResult >= 98) {
            System.out.println("Calificativul A");
        } else if (testResult >= 80) {
            System.out.println("Calificativul B");
        } else if (testResult >= 70) {
            System.out.println("Calificativul C");
        } else if (testResult >= 60) {
            System.out.println("Calificativul D");
        } else {
            System.out.println("Un astfel calificativ nu este definit!");
        }

        System.out.println("Finalizarea executarii programului");

    }
}
