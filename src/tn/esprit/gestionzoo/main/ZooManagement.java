package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.Zoo;
import tn.esprit.gestionzoo.entities.Animal;
import java.util.Scanner;
public class ZooManagement {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //int nbrCages ;
        //String zooName;
        //do {
          //   nbrCages = scanner.nextInt();
        //}while(nbrCages<2) ;
        //do {
            // zooName = scanner.nextLine();
        //}while (zooName.length() < 3 );
       // System.out.println( zooName + " comporte " +  nbrCages  +  " cages");

        Animal lion = new Animal("XXX","lion",14,true);
        Animal lion1 = new Animal("XXX","lion",14,true);
        Animal lion2 = new Animal("XXX","lion",14,true);
        Animal lion3 = new Animal("XXX","lion",14,true);
        Animal lion4 = new Animal("XXX","lion",14,true);
        Zoo myZoo = new Zoo("ZooZoo","Tunis");
        Zoo myZoo2 = new Zoo("tn.esprit.gestionzoo.entities.Zoo","Tunis");
        //sur la méthode main on gagne de l'espace et c'est plus facile de déclarer ?
       //myZoo.displayZoo();
        //lion.displayAnimal();
        //System.out.println(myZoo);
        //System.out.println(myZoo.toString()); //affichage d'un code ?
        //System.out.println(myZoo.name + myZoo.city + myZoo.nbrCages);
        //System.out.println(lion.family + lion.name + lion.age + lion.isMammal);
        myZoo.addAnimal(lion);
        myZoo2.addAnimal(lion1);
        myZoo2.addAnimal(lion2);
        myZoo2.addAnimal(lion3);
        myZoo.addAnimal(lion4);


        //myZoo.showAnimal();
        //System.out.println(myZoo.searchAnimal(lion));
        //System.out.println(myZoo.removeAnimal(lion));
        //System.out.println(myZoo.isZooFull());
        //System.out.println(myZoo.animalCount());
        //System.out.println(myZoo2.animalCount());
        //tn.esprit.gestionzoo.entities.Zoo newzoo = tn.esprit.gestionzoo.entities.Zoo.comparerZoo(myZoo,myZoo2);
        //System.out.println("The zoo that has more animals is : " + newzoo);
        myZoo.comparerZoo(myZoo,myZoo2);

    }
}
