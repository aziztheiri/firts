package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals;
    private Aquatic[] aquaticAnimals;
    private int nbr_animal;
    private String name;
    private String city;
    private final int NBR_CAGES = 25;
    public void setName(String name){
        if (!name.isEmpty()){
            this.name = name ;
        }
    }


    public Zoo(String name, String city) {
        if (!name.isEmpty()) {
            this.name = name ;
        }
        animals = new Animal[NBR_CAGES];
        aquaticAnimals = new Aquatic[15];
        this.name = name;
        this.city = city;
    }
    public float maxPenguinSwimmingDepth(){
        float max = 0;
        for (Aquatic animal : aquaticAnimals){
            if(animal instanceof Penguin){
                Penguin penguin = (Penguin) animal;
                float depth = penguin.getSwimmingDepth();
                if (depth > max) {
                    max = depth;
                }
            }
        } return max;
    }
    public void displayNumberOfAquaticsByType(){
        int nbP = 0 ;
        int nbD = 0;
        for (Aquatic animal :aquaticAnimals) {
            if(animal instanceof Penguin){
                nbP++;
            }
            if(animal instanceof Dolphin){
                nbD++;
            }
        }
        System.out.println(nbP + "penguin" + nbD + "dauphin");
    }

    public void displayZoo() {

        System.out.println(this.name + this.city);
    }

    public boolean addAnimal(Animal animal) {
        if(this.isZooFull() == false){

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null ) {
                animals[i] = animal;
                nbr_animal++;

                return true;
            }


        }
        }
        return false;
    }
    public void addAquaticAnimal(Aquatic aquatic){
        for (int i=0; i<aquaticAnimals.length;i++){
            if (aquaticAnimals[i] == null){
                aquaticAnimals[i] = aquatic;
                break;
            }
        }
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