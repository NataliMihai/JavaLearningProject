package com.mihainataliaqa.accessandmodifiers.peopleevidence;

import static jdk.nashorn.internal.objects.ArrayBufferView.length;

public class Person {

    //String firstname; ///se utilizeaza o variabila locala de tip defaul, care e/e accesibila numai in clasa Person

    public static boolean isHumman;
    public String firstName; // este accesibila si in afara clasei
    protected String lastName;
    public final int ID;
    private int age;
    public boolean isRetired;
    public int codIdnp;


    // cream constructor definit cu 3 parametri
    public Person(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = id;
    }

    // cream constructor definit cu 5 parametri
    public Person(String firstName, String lastName, int id, int age, boolean isRetired) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = id;
        //
        //verificam valoare age
        //this.age = age;
        //
        if (age > 0 && age < 100) {
            this.age = age;
        } else {
            System.out.println("This entered Age is not valid, the property age is still empty");
        }
        //// sau prin : this.setAge(age);
        ///
        this.isRetired = isRetired;

    }

    // cream constructor definit cu 6 parametri
    public Person(String firstName, String lastName, int id, int age, boolean isRetired, int codIdnp) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = id;
        //
        //verificam valoare age
        if (age > 0 && age < 100) {
            this.age = age;
        } else {
            System.out.println("This entered Age is not valid, the property age is still empty");
        }
        ///
        this.isRetired = isRetired;
        this.codIdnp =

    }

    public void setAge(int enteredAge) {
        if (enteredAge > 0 && enteredAge < 100) {
            this.age = enteredAge;
        } else {
            System.out.println("This entered Age is not valid, the property age is still empty");
        }
    }

    public int getAge() {

        return this.age;

//        if (enteredAge > 0 && enteredAge < 100) {
//            this.age = enteredAge;
//        } else {
//            System.out.println("This entered Age is not valid, the property ahe is still empty");
//        }
    }

    /// constructorul nu primeste valori
    public void printRetirementStatus() {
        if (this.isRetired) {
            System.out.println(this.firstName + " este la pensie");
        } else {
            System.out.println(this.firstName + " NU este la pensie");
        }
    }

///verificam daca valoarea atributului  codIdnp =  este valida !!! lungimea 6 cifre obligatoriu !!!
    // public void setCodIdnp(int enteredCodIdnp) {
//        if (length(enteredCodIdnp) > 6 && length(enteredCodIdnp) < 6) {
//            this.codIdnp = enteredCodIdnp;
//        } else {
//            System.out.println("This entered codIdnp is not valid, the property codIdnp is still empty (!!! 6 simbols!!!)");
//        }
    ///   }

    /// constructorul nu primeste valori
    public void printValidCodIdnp() {
        this.codIdnp = 25; //this.ID;

        if (length(this.codIdnp) > 6 && length(this.codIdnp) < 6) {
            System.out.println("Pentru " + this.firstName + " codIdnp:" + this.codIdnp + " este INCORECT !!!");
        } else {
            System.out.println(this.firstName + "atributul" + " codIdnp:" + this.codIdnp + " este VALID.");
        }
    }

}
