//Dependence = "use - a" relationship
package vehicle;
//Package ini berisi kendaraan dan bahan bakar 

/**
 * @author Amelia Nathasa
 * @version 1.0
 * @since 2022-03-20
 */
public class Vehicle {
     public static void main(String[] args){
        //Pengisian data bensin
        Fuel isi1 = new Fuel("Pertalite", 8000);
        Fuel isi2 = new Fuel("Pertamax", 9400);
        Fuel isi3 = new Fuel("Pertamina", 14300);
        
        //Cetak 
        isi1.refuel();
        isi2.refuel();
        isi3.refuel();
     }
}
