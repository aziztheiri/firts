package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals;
    private int nbr_animal;
    private String name;
    private String city;
    final int NBR_CAGES = 25;
    public void setName(String name){
        if (name.isEmpty()){
            System.out.println("Veuillez saisir un nom ") ;
        }
        else {
            this.name = name ;
        }
    }

    public Zoo(String name, String city) {
        animals = new Animal[NBR_CAGES];
        this.name = name;
        this.city = city;
    }

    public void displayZoo() {

        System.out.println(this.name + this.city);
    }

    public boolean addAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null && isZooFull()==false ) {
                animals[i] = animal;
                nbr_animal++;

                return true;
            }


        }
        return false;
    }

    public void showAnimal() {
        for (int i = 0; animals[i] != null; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; animals[i] != null; i++) {
            if (animal.getName() == animals[i].getName()) {
                return i;
            }

        }
        return -1;

    }

    public boolean removeAnimal(Animal animal) {
        for (int i = 0; animals[i] != null; i++) {
            if (i == searchAnimal(animal)) {
                Animal[] newAnimal = new Animal[animals.length - 1];
                System.arraycopy(animals, 0, newAnimal, 0, i);
                System.arraycopy(animals, i + 1, newAnimal, i, animals.length - i - 1);
                nbr_animal--;
                return true;

            }
        }
        return false;

    }

    public boolean isZooFull() {
       /* if (this.nbr_animal < this.NBR_CAGES)
            return false ;
        return true;*/
        //return !(this.nbr_animal < this.NBR_CAGES) ;
        //return !(this.nbr_animal < this.NBR_CAGES) ;
        return !(this.nbr_animal < this.NBR_CAGES) ? true : false;
    }


    @Override
    public String toString() {
        return this.name;

    }

    public  Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbr_animal < z2.nbr_animal)
            return z2 ;
        return z1;

    }
}