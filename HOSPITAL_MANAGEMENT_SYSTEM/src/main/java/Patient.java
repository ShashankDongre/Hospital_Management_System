package model;

/**
 *
 * @author Shashank
 */
public class Patient {
    private String PatientName;
    private String PatientAge;
    private String PatientGender;
    private String PatientTemperature;
    private String PatientPulseRate;
    private String PatientSpO2;
    private String PatientBloodPressure;
    private String PatientSymptoms;

    public String getPatientName() {
        return PatientName;
    }

    @Override
    public String toString() {
        return "Patient{" + "PatientName=" + PatientName + '}';
    }

    public void setPatientName(String PatientName) {
        this.PatientName = PatientName;
    }

    public String getPatientAge() {
        return PatientAge;
    }

    public void setPatientAge(String PatientAge) {
        this.PatientAge = PatientAge;
    }

    public String getPatientGender() {
        return PatientGender;
    }

    public void setPatientGender(String PatientGender) {
        this.PatientGender = PatientGender;
    }

    public String getPatientTemperature() {
        return PatientTemperature;
    }

    public void setPatientTemperature(String PatientTemperature) {
        this.PatientTemperature = PatientTemperature;
    }

    public String getPatientPulseRate() {
        return PatientPulseRate;
    }

    public void setPatientPulseRate(String PatientPulseRate) {
        this.PatientPulseRate = PatientPulseRate;
    }

    public String getPatientSpO2() {
        return PatientSpO2;
    }

    public void setPatientSpO2(String PatientSpO2) {
        this.PatientSpO2 = PatientSpO2;
    }

    public String getPatientBloodPressure() {
        return PatientBloodPressure;
    }

    public void setPatientBloodPressure(String PatientBloodPressure) {
        this.PatientBloodPressure = PatientBloodPressure;
    }

    public String getPatientSymptoms() {
        return PatientSymptoms;
    }

    public void setPatientSymptoms(String PatientSymptoms) {
        this.PatientSymptoms = PatientSymptoms;
    }
    
    
}
