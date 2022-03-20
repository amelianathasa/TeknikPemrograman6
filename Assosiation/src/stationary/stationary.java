/*Assosiation = hubungan yang mengatakan aktivitas diantara dua class
yang saling berkomunikasi*/
package stationary;
//Stationary terdiri dari buku, pensil, pulpen, penghapus 
import java.util.*; //Import package util
/**
 * @author Amelia Nathasa
 * @version 1.0
 * @since 2022-03-20
 */
//Class 1 berisi merk-merk Stationary (alat tulis) 
class merkClass{
    private String merkStationary;

    public String getMerkStationary() {
        return merkStationary;  //@return the merkStationary
    }
    public void setMerkStationary(String merkStationary) {
        this.merkStationary = merkStationary;       //@param merkStationary the merkStationary to set
    }
     @Override 
    public String toString(){
        return merkStationary;
    }  
}
//Class 2 berisi stationary 
class stationaryType{
    private String stationaryName; 
    
    private List<merkClass> merks;

    public String getStationaryName() {
        return stationaryName;      //@return the stationeryName
    }

    public void setStationaryName(String stationaryName) {
        this.stationaryName = stationaryName;    //@param stationeryName the stationeryName to set
    }
    
    public List<merkClass> getMerks(){
        return merks;               //@return the merks
    }
    
    public void setStationary(List<merkClass> merks){
        this.merks = merks;         //@param merks the merk to set
    }   
}

