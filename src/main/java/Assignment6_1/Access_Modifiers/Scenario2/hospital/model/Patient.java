package Assignment6_1.Access_Modifiers.Scenario2.hospital.model;

public class Patient {
    private String medicalHistory;
    String hospitalId;
    protected String insuranceDetails;
    public String name;

    public Patient(String name, String hospitalId, String medicalHistory, String insuranceDetails) {
        this.name = name;
        this.hospitalId = hospitalId;
        this.medicalHistory = medicalHistory;
        this.insuranceDetails = insuranceDetails;
    }

    public String getMedicalHistory() {
        return this.medicalHistory;
    }

    public String getHospitalId() {
        return this.hospitalId;
    }

    public String getInsuranceDetails() {
        return this.insuranceDetails;
    }
}
