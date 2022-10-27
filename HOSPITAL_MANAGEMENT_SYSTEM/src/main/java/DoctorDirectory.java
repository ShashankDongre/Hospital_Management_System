
package model;
import java.util.ArrayList;


/**
 *
 * @author Shashank
 */


public class DoctorDirectory {
    private ArrayList<Doctor>Directory;
    
    public DoctorDirectory(){
        this.Directory = new ArrayList<Doctor>();
    }
    public ArrayList<Doctor>getDirectory(){
        return Directory;
    }
    public void setDirectory(ArrayList<Doctor>Directory){
        this.Directory = Directory;
    }
    
    public Doctor adddNewDoctor(){
        Doctor newDoctor = new Doctor();
        Directory.add(newDoctor);
        return newDoctor;
    }
    
}
