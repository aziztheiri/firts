package tn.esprit.gestionzoo.entities;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal ;
    public String getName(){
        return name;

    }
    public void setAge(int age){
        if (age < 0 ){
            System.out.println("Veuillez saisir un age valide ");
        }
        else {
            this.age = age ;
        }
    }
    public Animal(String family, String name, int age, boolean
            isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    public void displayAnimal() {

        System.out.println(this.family + this.name + this.age + this.isMammal);
    }

    @Override
    public String toString() {
        return this.family + this.name + this.age + this.isMammal;

    }
}
