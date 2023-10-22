package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal {
    private int nbrlegs ;
    public Terrestrial(String name,String family , int age , boolean isMammal,int nbrlegs){
        super(family, name, age, isMammal);
        this.nbrlegs=nbrlegs;
    }

    }

