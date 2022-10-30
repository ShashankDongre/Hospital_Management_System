package model;
import java.util.ArrayList;
/*
 *
 * @author Shashank
 */
public class HospitalDirectory {
    // initialize an array list to store Hospital data in Hospital Directory
    private ArrayList<Hospital>directory;
    
    public HospitalDirectory(){
        this.directory = new ArrayList<Hospital>();
    }
    
   // getter of ArrayList 
    public ArrayList<Hospital>getDirectory(){
        return directory;
    }
    
    // setter of ArrayList
    public void setDirectory(ArrayList<Hospital>Directory){
        this.directory = Directory;
    }

    public Hospital addNewHospital()
    {
        //method to create newHospital;
       Hospital newHospital = new Hospital();
        directory.add(newHospital);
        return newHospital;
    }
    
    public void deleteHospital(Hospital hospital){
        // method to delete hospital
        directory.remove(hospital);
    }
 
}
