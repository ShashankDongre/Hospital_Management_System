
package model;

import java.util.ArrayList;



/**
 *
 * @author Shashank
 */


public class HospitalDirectory {
    //
    private ArrayList<Hospital>Directory;
    
    public HospitalDirectory(){
        this.Directory = new ArrayList<Hospital>();
    }
    
    public ArrayList<Hospital>getDirectory(){
        return Directory;
    }
    
    public void setDirectory(ArrayList<Hospital>Directory){
        this.Directory = Directory;
    }
/*
    public Hospital addNewHospital.(){
        Hospital newHospital = new Hospital();
        Directory.add(newHospital);
        return newHospital;
    }
    public void deleteHospital(Hospital hospital){
        Directory.remove(Hospital);
    }
*/
}
