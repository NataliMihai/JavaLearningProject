package com.mihainataliaqa.exceptions_service_task;

public class ArithmeticOperationService {

//    /// valid
//    public static double divideDataWithoutTryAndCatch(double a, double b) {
//        return a / b;
//    }

    public static int divideDataWithoutTryAndCatch(int a, int b) {
        return a / b;
    }

    public static int divideDataWithTryAndCatch(int a, int b) {
        try {
            int result =  a / b;
            return result;
        } catch(RuntimeException exceptionObject){
            //catch(ArithmeticException exceptionObject){
            System.out.println("An exception is occured:" + exceptionObject.getMessage());
            exceptionObject.printStackTrace();
            return 0;
        }
    }
}
