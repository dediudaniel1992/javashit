package com.company;

import java.io.Serializable;

public abstract class Animal implements Serializable {
    String nume;
    String specie;
    String varsta;

    void vorbeste() {
        System.out.print("bla bla");
    }

    abstract void merge(String stil);

    abstract void pisu();

    @Override
    public String toString(){
        return nume + specie + varsta;
    }

}
