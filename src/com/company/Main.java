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

        for (Animal a:animale
             ) {
            System.out.println(a);
            a.merge("acelasi");
        }

    }

}
