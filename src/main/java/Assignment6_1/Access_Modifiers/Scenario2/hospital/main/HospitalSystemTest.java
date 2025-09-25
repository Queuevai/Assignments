package Assignment6_1.Access_Modifiers.Scenario2.hospital.main;

import Assignment6_1.Access_Modifiers.Scenario2.hospital.model.Patient;
import Assignment6_1.Access_Modifiers.Scenario2.hospital.reception.Reception;
import Assignment6_1.Access_Modifiers.Scenario2.hospital.insurance.InsuranceClaim;
import Assignment6_1.Access_Modifiers.Scenario2.hospital.billing.Billing;

public class HospitalSystemTest {
    public static void main(String[] args) {
        Patient p1 = new Patient("John Doe", "HOSP001", "Flu, Allergies", "BlueCross");
        InsuranceClaim ic1 = new InsuranceClaim("Jane Smith", "HOSP002", "Broken Arm", "Aetna");

        Reception reception = new Reception();
        Billing billing = new Billing();

        reception.displayPatientOverview(p1);
        reception.displayPatientOverview(ic1);

        ic1.processClaim();

        billing.generateBill(p1);
        billing.generateBill(ic1);

        System.out.println("--- Main Test Access ---");
        System.out.println("Patient Name (public): " + p1.name);
        System.out.println("Main method can only directly access public 'name'.");
        System.out.println("To get Hospital ID, use getter: " + p1.getHospitalId());
        System.out.println("To get Medical History, use getter: " + p1.getMedicalHistory());
        System.out.println("To get Insurance Details, use getter: " + p1.getInsuranceDetails());
    }
}
