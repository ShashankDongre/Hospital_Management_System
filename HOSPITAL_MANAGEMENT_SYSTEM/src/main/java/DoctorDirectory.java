
package model;
import java.util.ArrayList;
/**
 *
 * @author Shashank
 */
public class DoctorDirectory {
    // initialize an array list to store Hospital data in Hospital Directory
    private ArrayList<Doctor>directory1;
    
    public DoctorDirectory(){
        
        this.directory1 = new ArrayList<Doctor>();
    }
    // getter of ArrayList 
    public ArrayList<Doctor>getDirectory(){
        return directory1;
    }
    // setter of ArrayList
    public void setDirectory(ArrayList<Doctor>Directory){
        this.directory1 = Directory;
    }
    
    /**
     *
     * @return
     */
    public Doctor adddNewDoctor(){
        Doctor newDoctor = new Doctor();
        directory1.add(newDoctor);
        return newDoctor;
    }
    public void deleteDoctor(Doctor doctor){
        // method to delete doctor
        directory1.remove(doctor);
    }
    
    }
    
    
    
    
