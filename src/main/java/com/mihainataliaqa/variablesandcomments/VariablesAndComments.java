package com.mihainataliaqa.variablesandcomments;

public class VariablesAndComments {

    public static void main(String[] args) {

        // Declare section
        // The primitive data type variables

        boolean falseBooleanVariable;
        boolean trueBooleanVariable;
        char firstCharFromAscii;
        char lastCharFromAscii;
        byte lowerLimitOfByteDataType;
        byte upperLimitOfByteDataType;
        short lowerLimitOfShortDataType;
        short upperLimitOfShortDataType;
        int lowerLimitOfIntDataType;
        int upperLimitOfIntDataType;
        long lowerLimitOfLongDataType;
        long upperLimitOfLongDataType;
        float lowerLimitOfFloatDataType;
        float upperLimitOfFloatDataType;
        double lowerLimitOfDoubleDataType;
        double upperLimitOfDoubleDataType;

        /**
         * Initialization of the above variables
         * RANGE OF VALID VALUES
         *
         * Atribuim variabilelor declarate valori
         * conform tabelului Limite conforM tipului datelor
         */

        falseBooleanVariable = false;
        trueBooleanVariable = true;
        firstCharFromAscii = 'a';
        lastCharFromAscii = 'Z';
        lowerLimitOfByteDataType = -128;
        upperLimitOfByteDataType = 127;
        lowerLimitOfShortDataType = -32768;
        upperLimitOfShortDataType = 32767;
        lowerLimitOfIntDataType = -2147483648;
        upperLimitOfIntDataType = 2147483647;
        lowerLimitOfLongDataType = -9223372036584775808L;
        upperLimitOfLongDataType = 9223372036584775807L;
        lowerLimitOfFloatDataType = -4.5f;  /*-3.4E + 38f; */
        upperLimitOfFloatDataType = 777.5f;  /*3.4E + 38f; */
        lowerLimitOfDoubleDataType = -1000.2589745622; /*-1.7E + 308; */
        upperLimitOfDoubleDataType = 159888.32557788; /*1.7E + 308; */

        System.out.println(upperLimitOfDoubleDataType);
        System.out.println(lastCharFromAscii);
        System.out.println("Valoare var Char este: " + lastCharFromAscii);
        System.out.println("Valorile var. de tip Byte sunt in limite: [" + lowerLimitOfByteDataType + " ; " + upperLimitOfByteDataType + "]");

    }
}
