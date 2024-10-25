package com.mihainataliaqa.operationsandciclicfunctions;

public class DayOfTheWeekService {
    public static void main(String[] args) {

        int dayNumber;
        String dayNume = "Joi";

        System.out.println(dayNume.toUpperCase());

        switch (dayNume.toUpperCase()) {
            case "LUNI":
                dayNumber = 1;
                break;
            case "MARTI":
                dayNumber = 2;
                break;
            case "MIERCURI":
                dayNumber = 3;
                break;
            case "JOI":
                dayNumber = 4;
                break;
            case "VINERI":
                dayNumber = 5;
                break;
            case "SIMBATA":
                dayNumber = 6;
                break;
            case "DUMINICA":
                dayNumber = 7;
                break;
            default:
                dayNumber = 0;
                System.out.println("Ati introdus o zi nedeterminata");

        }

        System.out.println("Numarul zilei <" + dayNume + "> este " + dayNumber);

    }
}
