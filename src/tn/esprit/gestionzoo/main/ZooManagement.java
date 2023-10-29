package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;

import java.util.Scanner;
public class ZooManagement {

    public static void main(String[] args) throws ZooFullException {
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

        Animal lion = new Animal("XXX","lion",-18,true);
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
        try {
            myZoo.addAnimal(lion);
            System.out.println("Number of animals: " + myZoo.getNbrAnimal());

            myZoo.addAnimal(lion1);
            System.out.println("Number of animals: " + myZoo.getNbrAnimal());

            myZoo.addAnimal(lion2);
            System.out.println("Number of animals: " + myZoo.getNbrAnimal());

            myZoo.addAnimal(lion3);
            System.out.println("Number of animals: " + myZoo.getNbrAnimal());

            myZoo.addAnimal(lion4);
            System.out.println("Number of animals: " + myZoo.getNbrAnimal());
        } catch (ZooFullException e) {
            System.out.println("ZooFullException: " + e.getMessage());
        } catch (InvalidAgeException ex) {
            System.out.println("InvalidAgeException: " + ex.getMessage());
        }




        //myZoo.showAnimal();
        //System.out.println(myZoo.searchAnimal(lion));
        //System.out.println(myZoo.removeAnimal(lion));
        //System.out.println(myZoo.isZooFull());
        //System.out.println(myZoo.animalCount());
        //System.out.println(myZoo2.animalCount());
        //tn.esprit.gestionzoo.entities.Zoo newzoo = tn.esprit.gestionzoo.entities.Zoo.comparerZoo(myZoo,myZoo2);
        //System.out.println("The zoo that has more animals is : " + newzoo);
        //myZoo.comparerZoo(myZoo,myZoo2);
        //Aquatic A = new Aquatic("zoo","aquaa","dkdkdk",15,true);
        Penguin P = new Penguin("zoo","pengou","pppp",15,false,40);
        Penguin P2 = new Penguin("zoo","fff","kkk",15,false,30);
        Penguin P3 = new Penguin("zoo","zeze","klfffk",15,false,60);

        Dolphin D = new Dolphin("zoo","dolphou","dddddd",15,true,60);
        Terrestrial T = new Terrestrial("fahd","terrou",15,true,4);
        //System.out.println(A+ "\n");
        myZoo.addAquaticAnimal(P);
        myZoo.addAquaticAnimal(P2);
        myZoo.addAquaticAnimal(P3);
        myZoo.addAquaticAnimal(D);
        P.swim();
        P2.swim();
        P3.swim();
        D.swim();
        System.out.println(myZoo.maxPenguinSwimmingDepth());
        myZoo.displayNumberOfAquaticsByType();


    }
}
