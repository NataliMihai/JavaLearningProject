package com.mihainataliaqa.zooclubservice;

public class Cat extends Animal  {

    //implements AnimalInterface

    //definim un constructor p/u a crea obiecte de tipul Dog cu parametrul formal String name
    public Cat(String name) {
        //cuvant cheie super(), e/e folosit p/u apelul constructorului clasei parinte, care are nevoie de acesta proprietate
        super(name);
    }

    //makeSoundAnimal e/e o metoda declarata in AnimalInterface, respectiv trebuie implementata, ea fiind acolo abstracta
    @Override
    public void makeSoundAnimal() {
        System.out.println("Cat " + getName() + " says: Meow!");
    }

    //eat() e/e o metoda declarata in clasa abstracta Animal, respectiv trebuie implementata, ea fiind acolo abstracta
      @Override
    public void eat() {
        System.out.println("Fish food - neam neam");
    }
}
