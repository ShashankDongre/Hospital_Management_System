package model;
import java.util.ArrayList;

/**
 *
 * @author Shashank
 */
public class PatientVitalsDirectory {
    // initialize an array list to store Patient Vitals data in the Patient Vitals Directory
    private ArrayList<Patient>directory3;
    
    public PatientVitalsDirectory(){
        this.directory3 = new ArrayList<Patient>();
    }
    public ArrayList<Patient>getDirectory(){
        return directory3;
    }
    public void setDirectory(ArrayList<Patient>Directory){
        this.directory3 = Directory;
    }
    
    public Patient adddNewPatientVitals(){
        Patient newPatientVitals = new Patient();
        directory3.add(newPatientVitals);
        return newPatientVitals;
    }
    
    
    
    
    
    
}
