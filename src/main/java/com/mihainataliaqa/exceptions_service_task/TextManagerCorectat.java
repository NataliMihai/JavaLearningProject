package com.mihainataliaqa.exceptions_service_task;

public class TextManagerCorectat {

    public static int getTheTextLengthWithoutTryAndCatch(String inputStr) {
        return inputStr.length();
    }

    public static int getTheTextLengthWithTryAndCatch(String inputStr) {
        try {
            return inputStr.length();
        } catch (
                NullPointerException informationHolderObjectInTryBlock) {
            //capturedExceptionInTryBlock
            System.out.println("An exception has been handled with the following message:" + informationHolderObjectInTryBlock.getMessage());
            return 0;
        } finally {
            System.out.println("The code has been executed ");
        }
    }

    public static int getTheTextLengthIfElse(String inputStr) {
        if (inputStr == null) {
            System.out.println("Input string is null value, be carefull!");
            return 0;
        } else {
            return inputStr.length();
        }


    }
}
