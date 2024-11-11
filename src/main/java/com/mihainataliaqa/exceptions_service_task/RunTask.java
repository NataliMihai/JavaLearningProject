package com.mihainataliaqa.exceptions_service_task;

public class RunTask {

    public static void main(String[] args) {
        int stringLength  = TextManagerCorectat.getTheTextLengthWithoutTryAndCatch("Sternocleidomastoidian") ;
        System.out.println(stringLength);

//        String dataStr = null;
//        System.out.println(TextManagerCorectat.getTheTextLengthWithoutTryAndCatch(dataStr));
//        System.out.println("I am NOT happy and I know it!");
        ///
        String dataStr = null;
        System.out.println(TextManagerCorectat.getTheTextLengthWithTryAndCatch(dataStr));
        System.out.println("I am happy and I know it!");

////
        System.out.println(ArithmeticOperationService.divideDataWithoutTryAndCatch(10, 5));
       // System.out.println(ArithmeticOperationService.divideDataWithoutTryAndCatch(10, 0)); // Infinity !!! eroare verificata
        System.out.println(ArithmeticOperationService.divideDataWithTryAndCatch(10, 0)); //
        System.out.println("The code is fine, the execution is good ");


    }
}
