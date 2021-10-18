package com.company;

public class Vertebrate extends Animal {
    @Override
    void merge(String stil) {
        System.out.print(stil);
    }

    @Override
    void pisu() {

    }

    void sare(){
        System.out.print("\nsare odata");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }

        final Vertebrate other = (Vertebrate) obj;

        if ((this.nume == null) ? (other.nume != null) : !this.nume.equals(other.nume)) {
            return false;
        }

        if (this.specie != other.specie) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + (this.nume != null ? this.nume.hashCode() : 0);
        hash = 53 * hash + this.specie.hashCode();
        return hash;
    }
}
