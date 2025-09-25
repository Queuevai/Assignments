package Assignment6_1.Access_Modifiers.Scenario2.hospital.billing;


import Assignment6_1.Access_Modifiers.Scenario2.hospital.model.Patient;

public class Billing {

    public void generateBill(Patient patient) {
        System.out.println("--- Billing for " + patient.name + " ---");
        System.out.println("Patient Name (public): " + patient.name);

        System.out.println("Patient ID (via public getter): " + patient.getHospitalId());


        System.out.println("Billing can only access 'name' and public getters for other info.");
        System.out.println("Cannot directly access 'medicalHistory', 'hospitalId', or 'insuranceDetails'.");
        System.out.println();
    }
}
