package com.mihainataliaqa.zooclubservice;

public class Lion extends Animal {

    //implements AnimalInterface

    //definim un constructor p/u a crea obiecte de tipul Dog cu parametrul formal String name
    public Lion(String name) {
        //cuvant cheie super(), e/e folosit p/u apelul constructorului clasei parinte, care are nevoie de acesta proprietate
        super(name);
    }

    //makeSoundAnimal e/e o metoda declarata in AnimalInterface, respectiv trebuie implementata, ea fiind acolo abstracta
    @Override
    public void makeSoundAnimal() {
        System.out.println("Lion " + getName() + " says: RHHHH!");
    }

    //eat() e/e o metoda declarata in clasa abstracta Animal, respectiv trebuie implementata, ea fiind acolo abstracta
    @Override
    public void eat() {
        //metoda getName() e/e concreta si implementata in clasa parinte Animal. Aceasta poate fi declarata acolo so de tip Protected
        System.out.println(getName() + " is eating meat");
    }
}