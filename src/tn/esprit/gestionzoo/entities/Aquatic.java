package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends Animal {

    private String habitat;
    public Aquatic(String habitat,String name,String family , int age , boolean isMammal){
        super( family, name, age, isMammal);
        this.habitat=habitat;
    }

    @Override
    public String toString() {
        return super.toString() + this.habitat;
    }
    public abstract void swim() ;
    @Override
    public boolean equals(Object object) {
        if (null == object) return false;
        if (object instanceof Aquatic aquatic){
            return age==aquatic.age && name.equals(aquatic.name) && habitat.equals(aquatic.habitat);
        }
        return false ;
    }
}
