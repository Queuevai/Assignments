package Assignment6_1.Access_Modifiers.Scenario2.hospital.reception;


import Assignment6_1.Access_Modifiers.Scenario2.hospital.model.Patient;

public class Reception {

    public void displayPatientOverview(Patient patient) {
        System.out.println("--- Reception View for " + patient.name + " ---");
        System.out.println("Patient Name (public): " + patient.name);

        System.out.println("Patient ID (via public getter): " + patient.getHospitalId());


        System.out.println("Reception can access 'name' directly and 'hospitalId' via getter.");
        System.out.println("Cannot directly access 'medicalHistory' or 'insuranceDetails'.");
        System.out.println();
    }
}
