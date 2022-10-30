
package model;

/**
 *
 * @author Shashank
 */
public class Person {
    
    private String PersonName;
    private String PersonAge;
    private String PersonGender;
    private String PersonAddress;
    private String PersonCity;
    private String PersonZipCode;
    private String PersonPhone;

    public String getPersonName() {
        return PersonName;
    }

    @Override
    public String toString() {
        return "Person{" + "PersonName=" + PersonName + '}';
    }

    public void setPersonName(String PersonName) {
        this.PersonName = PersonName;
    }

    public String getPersonPhone() {
        return PersonPhone;
    }

    public void setPersonPhone(String PersonPhone) {
        this.PersonPhone = PersonPhone;
    }

    public String getPersonAge() {
        return PersonAge;
    }

    public void setPersonAge(String PersonAge) {
        this.PersonAge = PersonAge;
    }

    public String getPersonGender() {
        return PersonGender;
    }

    public void setPersonGender(String PersonGender) {
        this.PersonGender = PersonGender;
    }

    public String getPersonAddress() {
        return PersonAddress;
    }

    public void setPersonAddress(String PersonAddress) {
        this.PersonAddress = PersonAddress;
    }

    public String getPersonCity() {
        return PersonCity;
    }

    public void setPersonCity(String PersonCity) {
        this.PersonCity = PersonCity;
    }

    public String getPersonZipCode() {
        return PersonZipCode;
    }

    public void setPersonZipCode(String PersonZipCode) {
        this.PersonZipCode = PersonZipCode;
    }
   
}
