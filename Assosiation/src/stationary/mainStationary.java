//Class main of stationary 
package stationary;
import java.util.ArrayList;
import java.util.List;
/**
 * @author Amelia Nathasa
 * @version 1.0
 * @since 2022-03-20
 */
public class mainStationary {
    //Class main untuk memanggil method - method yang sudah di definisikan di kelas lain
    public static void main(String[] args) {
        stationaryType newStat = new stationaryType();
        newStat.setStationaryName("Pencil");       //Memasukkan salah satu jenis stationary
        
        merkClass merk = new merkClass();
        merk.setMerkStationary("Joyco");    //Memasukkan merk dari stationary 
        merkClass merk2 = new merkClass();
        merk2.setMerkStationary("Faber-Castell");
        
        //Memasukkan merk kedalam list 
        List<merkClass>empList = new ArrayList<merkClass>();    
        empList.add(merk);      
        empList.add(merk2);
        
        newStat.setStationary(empList);
        
        //Mengeluarkan output 
        System.out.println(newStat.getMerks()+" are merks of "+ newStat.getStationaryName());   
    }
}



