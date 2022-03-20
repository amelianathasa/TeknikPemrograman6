//Main class of Hospital
package hospital;
import java.util.ArrayList;
import java.util.List;
/**
 * @author Amelia Nathasa
 * @version 1.0
 * @since 2022-03-20
 */
public class mainHospital {
    
    public static void main(String[] args){
        //Memasukan data dokter
        Doctor d1 = new Doctor(123, "Andy Putra", "Ilmu Bedah Ortopedi", "Kepala Department");
        Doctor d2 = new Doctor(345, "Teddy Putra", "Ilmu Bedah Ortopedi", "Anggota Department");
        Doctor d3 = new Doctor(678, "Mila Putri", "Rekam Medis", "Kepala Department");
        Doctor d4 = new Doctor(910, "Fani Putra", "Rekam Medis", "Anggota Department");
        Doctor d5 = new Doctor(112, "Chandra Putra", "Rekam Medis", "Anggota Department");
            
        //Make a list of Ilmu Bedah Ortopedi 
        List<Doctor> ortopedi = new ArrayList<Doctor>();
        ortopedi.add(d1);
        ortopedi.add(d2);
            
        //Make a list of Rekam Medis
        List<Doctor> kamdis = new ArrayList<Doctor>();
        kamdis.add(d3);
        kamdis.add(d4);
        kamdis.add(d5);
            
        Department OP = new Department(1, "Ilmu Bedah Ortopedi", ortopedi);
        Department RM = new Department(2, "Rekam Medis", kamdis);
        
        List<Department> departments = new ArrayList<Department>();
        departments.add(OP);
        departments.add(RM);
        
        //Create an instance of Hospital 
        Hospital hospital = new Hospital(1, "RS Dustira", departments);
        
        System.out.println("Total Doctor in Hospital : ");
        System.out.println(hospital.getTotalDoctor());
        
    }
}
