package com.mihainataliaqa.metodstask;

import java.util.Random;
import java.util.UUID;

public class DataGeneratortUtil {
   static Random random = new Random(); // utilizam obiect <random> de tip global

    /// II Varianta - utilizam metode de statice/de clasa
    ///
    ///  p/u AGE
    public static int getRandomInt(int startLimit, int endLimit) {
       // Random random = new Random();  // utilizam obiect <random> de tip local
        int delta = endLimit - startLimit;
        int deltaRandomInt = random.nextInt(delta);
        int randomNumber = deltaRandomInt + startLimit;
        return randomNumber;
    }

    public static int getRandomInt(int limit) {
       // Random random = new Random(); // utilizam obiect <random> de tip local
        return random.nextInt(limit);
    }

    ///  p/u UUID
    public static String getRandomString() {
        return UUID.randomUUID().toString();
    }
    ///  p/u EMAIL
    public static String getRandomEmail(String emailDomain) {
        return UUID.randomUUID().toString() + emailDomain;
    }

    public static String getRandomEmail(String prefix, String emailDomain) {
        return prefix + getRandomInt(9999999) + emailDomain;
    }
}
