package com.mihainataliaqa.metodstask;

public class ExecutionService {
    public static void main(String[] args) {

        // utiliz constructorului fara parametri
        Customer customer001 = new Customer();

        //customer001.name = "Gabriel";  // nu funtioneaza, deoarece var name e/e te tip privat
        customer001.setName("Gabriel");
        //customer001.setEmail("gabrielboss@gmail.com");
        // inlocuim r.11 cu valoarea random p/n utilizarea metodei statice/de clasa
        customer001.setEmail(DataGeneratortUtil.getRandomEmail("gabriel++", "@gmail.com"));
        //customer001.setAge(99);
        //inlocuim r.14 cu valoarea random p/n utilizarea metodei statice/de clasa
        customer001.setAge(DataGeneratortUtil.getRandomInt(18, 100));

//        System.out.println(customer001.getName());
//        System.out.println(customer001.getEmail());
//        System.out.println(customer001.getAge());

        /// inlocuim r.16-18 cu afisarea datelor obiectului
        //utilizind constructorul getTheObjectInformation()
        System.out.println(customer001.getTheObjectInformation());
        // System.out.println();

        // utiliz constructorului cu parametri
        //Customer customer002 = new Customer("Vasile", "vasile@gmail.com", 87);
        // Customer customer002 = new Customer("Vasile", "vasile@gmail.com", DataGeneratortUtil.getRandomInt(18,100));
        Customer customer002 = new Customer("Vasile", DataGeneratortUtil.getRandomEmail("vasile++", "@gmail.com"), DataGeneratortUtil.getRandomInt(18, 100));
        System.out.println(customer002.getTheObjectInformation());

        System.out.println(DataGeneratortUtil.getRandomInt(18)); // random Age
        System.out.println(DataGeneratortUtil.getRandomString()); // random UUID
        System.out.println(DataGeneratortUtil.getRandomEmail("@gmail.com"));

        System.out.println(DataGeneratortUtil.getRandomEmail("andrei+", "@gmail.com"));

    }

}
