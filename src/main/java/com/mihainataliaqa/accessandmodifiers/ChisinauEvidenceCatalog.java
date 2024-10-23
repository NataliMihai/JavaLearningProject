package com.mihainataliaqa.accessandmodifiers;

import com.mihainataliaqa.accessandmodifiers.peopleevidence.Person;

public class ChisinauEvidenceCatalog {
    public static void main(String[] args) {

        //folosim constructor predefinit fara parametri Person()
        /// Person ion001 = new Person();

        //folosim constructor definit cu 3 parametri Person(...)
        Person ion001 = new Person("Ion", "Busuioc", 58761);

        System.out.println(ion001.firstName + " / the age is: " + ion001.ID);
        System.out.println(ion001.firstName + " " + ion001.ID + " " + ion001.getAge());

        //folosim constructor definit cu 5 parametri Person(.....)
        Person olga001 = new Person("Olga", "Grozavu", 58761, 18, false);

        System.out.println(olga001.firstName + " " + olga001.ID + " / the age is: " + olga001.getAge());


        Person person = new Person("Valoare1", "Valoare1", 10965447, 524, true);
        System.out.println(person.firstName + " age " + person.getAge());

//        if (ion001.isRetired) {
//            System.out.println(ion001.firstName + " este pensionar");
//        } else {
//            System.out.println(ion001.firstName + " NU este pensionar");
//        }
        ion001.printRetirementStatus();

//        if (olga001.isRetired) {
//            System.out.println(olga001.firstName + " este pensionar");
//        } else {
//            System.out.println(olga001.firstName + " NU este pensionar");
//        }

        olga001.printRetirementStatus();

        person.printRetirementStatus();

        Person.isHumman = true; /// Person este clasa, deoarece isHumman este variaabila statica (de clasa), care apartine Clasei Person

        /////verificam codIdnp

        ion001.printValidCodIdnp();

        //olga001.printValicodIdnp();

        //person.printValicodIdnp();

    }
}
