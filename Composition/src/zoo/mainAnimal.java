//Class main Animal
package zoo;
//Import package untuk array list 
import java.util.ArrayList;
import java.util.List;
/**
 * @author Amelia Nathasa
 * @version 1.0
 * @since 2022-03-20
 */
public class mainAnimal 
{
    public static void main(String[] args) {
        //Creating the Objects of Book Class 
        Animal an1 = new Animal("Lion", "Carnivore");
        Animal an2 = new Animal("Goat", "Herbivore");
        Animal an3 = new Animal("Monkey", "Omnivore");
        Animal an4 = new Animal("Bear", "Omnivore");
        Animal an5 = new Animal("Horse", "Herbivore");
        //Creating the list which contains the no. of books 
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(an1);
        animals.add(an2);
        animals.add(an3);
        animals.add(an4);
        animals.add(an5); 
        Zoo zoo = new Zoo(animals);
        List<Animal> anl = zoo.getTotalAnimal();
        for(Animal an : anl){
            System.out.println(an.animalName + " is a " + an.animalCategory );  
        }
    }
}


