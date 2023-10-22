package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {
    private float swimmingDepth;
    public Penguin(String habitat,String name,String family , int age , boolean isMammal,float swimmingDepth){
        super( family, name, habitat, age , isMammal);
        this.swimmingDepth=swimmingDepth;
    }
    public float getSwimmingDepth(){
        return swimmingDepth;

    }

    @Override
    public String toString() {
        return super.toString() + this.swimmingDepth;
    }
    public void swim() {
        System.out.println("This Penguin is swimming.");
    }
}

