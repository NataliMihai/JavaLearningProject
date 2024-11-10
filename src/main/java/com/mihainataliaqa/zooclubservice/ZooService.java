package com.mihainataliaqa.zooclubservice;

public class ZooService {
    public static void main(String[] args) {
        //mai jos se aplica polimorfismul p/u a declara un obiect de tip Animal, insa il cream cu constructorul clasei copil Dog...
        Animal dog = new Dog("Graf");
        Cat cat = new Cat("Baghira");
        Dog secondDog = new Dog("Zeu");
        Lion lion001 = new Lion("Pegas");

        dog.makeSoundAnimal();
        dog.eat();

        secondDog.makeSoundAnimal();
        secondDog.eat();

        cat.makeSoundAnimal();
        cat.eat();

        lion001.makeSoundAnimal();
        lion001.eat();

    }
}
