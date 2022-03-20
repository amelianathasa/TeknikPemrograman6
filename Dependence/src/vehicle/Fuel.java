//Class vehicle berisi bensin yang digunakan pada kendaraan
package vehicle;

/**
 * @author Amelia Nathasa
 * @version 1.0
 * @since 2022=03-20
 */

class Fuel {
    //Kamus Data 
    String fuelName; 
    int price; 
   
    //Membuat Contructor dengan parameter 
    Fuel(String fuelName, int price)
        {
            this.fuelName = fuelName;
            this.price = price;            
        }
    
    public void refuel(){
        System.out.println("Kendaraan menggunakan Bahan Bakar : " + fuelName);
         System.out.println("Dengan Harga Bahan Bakar : " + price);
        
    }
    
}







