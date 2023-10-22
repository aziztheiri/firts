package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic{
    private float swimmingSpeed;
    public Dolphin(String habitat,String name,String family , int age , boolean isMammal,float swimmingSpeed){
        super( family, name, habitat, age , isMammal);
        this.swimmingSpeed=swimmingSpeed;
    }

    @Override
    public String toString() {
        return super.toString() + this.swimmingSpeed;
    }
    public void swim() {
        System.out.println("This Dolphin is swimming.");
    }
}
