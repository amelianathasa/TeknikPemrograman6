/*Composition = relasi dimana dua entitas bergantung sama lain*/
package zoo;
//package ini berisi Animal dan Zoo
import java.util.List;
/**
 * @author Amelia Nathasa
 * @version 1.0
 * @since 2022-03-22
 */
class Animal {
    public String animalName; 
    public String animalCategory; 
    Animal(String animalName, String animalCategory){
        this.animalName = animalName; 
        this.animalCategory = animalCategory; 
    }
}
//Zoo class contains List of animals 
class Zoo{
    //reference to refer to list of animals 
    private final List<Animal> animals; 
    Zoo (List<Animal> animals){
        this.animals = animals; 
    } 
    public List<Animal> getTotalAnimal(){
        return animals;
    }
    
}
