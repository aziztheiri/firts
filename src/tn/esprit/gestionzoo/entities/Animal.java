package tn.esprit.gestionzoo.entities;

public class Animal {
    public String family;
    public String name;
    public int age;
    public boolean isMammal ;
    public String getName(){
        return name;

    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        /*if (age < 0 ){
            this.age = 0;
        }*/
        //else {
            this.age = age ;
        //}
    }
    public Animal(String family, String name, int age, boolean
            isMammal) {
      /*  if (age < 0 ){
            this.age = 0;
        }
        else {*/
            this.age = age ;

        this.family = family;
        this.name = name;
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
