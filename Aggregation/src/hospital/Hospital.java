/*Aggregation adalah suatu hubungan yang merepresentasikan kepemilikan (has-a)
antar dua kelas*/
package hospital;
//Pada package ini akan ada hubungan antara rumah sakit, departemen dan dokter 
/**
 * @author Amelia Nathasa
 * @version 1.0
 * @since 2022-03-22
 */
import java.io.*;       //Mengimport package java input-output 
import java.util.*;     //Mengimport package java util 
//Class 1, class dokter untuk mengetahui atribut yang dimiliki oleh dokter
class Doctor{
    int nip; 
    String name; 
    String department; 
    String position; 
    
//Membuat Contructor dengan parameter 
    Doctor(int nip, String name, String department, String position)
        {
            this.nip = nip; 
            this.name = name;
            this.department = department; 
            this.position = position; 
        }
}
//Class 2, class department berisi department yang ada oleh rumah sakit dan dimiliki oleh setiap dokter
class Department{
    int noDept; 
    String name; 
    private List<Doctor> doctors; 
    //Setiap department terdiri dari no department, nama department, dan doktor yang masuk departemen tersebut
    Department(int noDept, String name, List<Doctor> doctors){
        this.noDept = noDept;
        this.name = name; 
        this.doctors = doctors;
    }
    
    public List<Doctor> getDoctors(){
        return doctors; 
    }
}

//Class 3, class Hospital terdiri dari departemen dan dokter 
public class Hospital {
    int idHospital; 
    String hospitalName; 
    private List<Department> departments; 
    
    Hospital(int idHospital, String hospitalName, List<Department> departments){
        this.idHospital = idHospital; 
        this.hospitalName = hospitalName; 
        this.departments = departments; 
    }
    
    //Get Total Doctor 
    
    public int getTotalDoctor(){
        int totalDoctor = 0; 
        List<Doctor> doctors; 
        for(Department dept : departments){
            doctors = dept.getDoctors();
            for(Doctor d : doctors){
                totalDoctor++;
            }
        }
        return totalDoctor; 
    }
    
}
       