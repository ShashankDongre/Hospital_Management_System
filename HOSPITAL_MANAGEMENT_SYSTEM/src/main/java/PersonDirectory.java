package model;
import java.util.ArrayList;

/**
 *
 * @author Shashank
 */
public class PersonDirectory {
    // initialize an array list to store Person data into Person Directory
    private ArrayList<Person>directory2;
    
    public PersonDirectory(){
        this.directory2 = new ArrayList<Person>();
    }
    public ArrayList<Person>getDirectory(){
        return directory2;
    }
    public void setDirectory(ArrayList<Person>Directory){
        this.directory2 = Directory;
    }
    
    public Person adddNewPerson(){
        Person newPerson = new Person();
        directory2.add(newPerson);
        return newPerson;
    }

}
