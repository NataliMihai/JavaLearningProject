package com.mihainataliaqa.zooclubservice;

// Clasa Animal e/e dedicata procesului  de mostenire, constructorul Animal nu trebuie folosit p/u initializarea obiectelor
public abstract class Animal implements AnimalInterface{
    //variabila de instanta name, va fi accesibila doar in clasa parinte Animal - private
    private String name;

    //Constructorul cu un parametruva permite setarea unui nume absolut p/u toate animalele (clase) , create in cadrul programului
    public Animal(String name) {
        this.name = name;
    }

    //metoda getName() e/e de tip public si returneaza valoarea numelui, pe care il poseda animalul
    public String getName() {
        return name;
    }

    //metoda abstracta eat(), nu are implementare, numai definire, aceasta va fi rescrisa in clasele - copii
    public abstract void eat();
}
