package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Pestele pestele = new Pestele();
        Vertebrate vertebrate= new Vertebrate();
        Animal animal = new Pestele();
        Animal pasare = new Pasare();
        Pasare pasare1 = new Pasare();
        //Animal animal = new Animal();
        //Pestele pestele1 = new Vertebrate();
        Avion avion = new Avion();

        avion.zboara();

        vertebrate.equals(pasare);


        vertebrate.merge("\nalandala");
        vertebrate.sare();

        pestele.merge("\nmisto");
        pestele.sare();

        pasare1.zboara();

        List<Animal> animale = new ArrayList<>();
        animale.add(animal);
        animale.add(pestele);
        animale.add(vertebrate);
        //TODO
        /*
            Avem o lista de animale, vreau sa putem sa le ordonam si sa le afisam in functie de proprietatile lor
            alfabetic, dupa greutate sau dupa varsta(proprietati noi)
            Links :
            https://www.baeldung.com/java-comparator-comparable
            https://www.geeksforgeeks.org/comparable-vs-comparator-in-java/
            https://stackoverflow.com/questions/4108604/java-comparable-vs-comparator

         */
        for (Animal a:animale
             ) {
            System.out.println(a);
            a.merge("acelasi");
        }

    }

}
